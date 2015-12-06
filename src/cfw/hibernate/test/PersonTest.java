package cfw.hibernate.test;

import org.junit.Test;

import cfw.hibernate.beans.Person;
import cfw.hibernate.dao.person.PersonDao;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 下午8:50:24
 */
public class PersonTest {
	private PersonDao personDao;
	
	public PersonTest(){
		this.personDao = new PersonDao();
	}
	
	@Test
	public void queryPerson(){
		String name = "Duskrain";
		this.personDao.beforeOperation();
		Person person = this.personDao.findUniqueBy(name);
		System.out.println(person);
		this.personDao.afterOperation();
	}
}
