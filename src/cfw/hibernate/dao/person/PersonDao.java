package cfw.hibernate.dao.person;

import org.hibernate.Query;

import cfw.hibernate.beans.Person;
import cfw.hibernate.dao.AbstractDao;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 下午8:07:01
 */
public class PersonDao extends AbstractDao<Person>{
	
	@Override
	public Person findUniqueBy(Long id) {
		String queryString = "from Person p where p.id = :id";
		Query query = this.session.createQuery(queryString);
		query.setParameter("id", id);
		
		Person person = (Person) query.uniqueResult();
		return person;
	}

	@Override
	public Person findUniqueBy(String name) {
		String queryString = "from Person p where p.name = :name";
		Query query = this.session.createQuery(queryString);
		query.setParameter("name", name);
		
		Person person = (Person) query.uniqueResult();
		return person;
	}

	@Override
	public void save(Person person) {
		
		this.session.save(person);
		
	}
	
	@Override
	public void merge(Person person){
		this.session.merge(person);
	}

	@Override
	public void beforeOperation() {
		this.session = sessionFactory.openSession();
		this.transaction = this.session.beginTransaction();
	}

	@Override
	public void afterOperation() {
		this.transaction.commit();
		this.session.close();
	}

}
