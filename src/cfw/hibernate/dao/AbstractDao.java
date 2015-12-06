package cfw.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 下午8:50:30
 */
public abstract class AbstractDao<T> implements DaoInterface<T>{

	private static Configuration configuration;
	private static ServiceRegistryBuilder srBuilder;
	private static ServiceRegistry serviceRegistry;
	
	// Keep in the memory and not close manually. 
	private static SessionFactory sessionFactory; 
	
	static{
		configuration = new Configuration().configure("hibernate.config.xml");
		srBuilder = new ServiceRegistryBuilder(); 
		serviceRegistry = srBuilder.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	protected Session session;
	protected Transaction transaction;

	public abstract void beforeOperation();
	
	public abstract void afterOperation();
}
