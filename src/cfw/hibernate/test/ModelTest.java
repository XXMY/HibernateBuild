package cfw.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cfw.hibernate.beans.Person;
import cfw.hibernate.beans.Skill;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 上午11:01:54
 */
public class ModelTest {
	private SessionFactory sessionFactory;
	private Session session =  null;
	private Transaction transaction = null;
	
	@Before
	public void setup(){
		Configuration configuration =  new Configuration();
		configuration.configure("hibernate.config.xml");
		ServiceRegistryBuilder srBuilder = new ServiceRegistryBuilder();
		srBuilder.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = srBuilder.buildServiceRegistry();
		this.sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		this.session = this.sessionFactory.openSession();
		this.transaction = session.beginTransaction();
	}
	
	@After
	public void finish(){
		this.transaction.commit();
		this.session.close();
		this.sessionFactory.close();
	}
	
	//@Test
	public void personTest(){
		String name = "Duskrain";
		
		Person person = this.findPerson(name);
		if(person == null){
			//Assert.fail("Find person named '"+name+"' failed.");
			person = new Person(name);
			session.save(person);
		}
		System.out.println(person);
		
	}
	
	private Person findPerson(String name){
		String queryString = "from Person p where p.name = :name";
		Query query = this.session.createQuery(queryString);
		query.setParameter("name", name);
		
		Person person = (Person)query.uniqueResult();
		
		return person;
	}
	
	private Skill findSkill(String name){
		String queryString = "from Skill s where s.name = :name";
		Query query = this.session.createQuery(queryString);
		query.setParameter("name",name);
		Skill skill = (Skill) query.uniqueResult();
		
		return skill;
	}
	
	@Test
	public void testSavingRanking(){
		Person subject = this.findPerson("Duskrain");
		Person observer = this.findPerson("Lombardo");
		
		
		
	}
	
	
}


























