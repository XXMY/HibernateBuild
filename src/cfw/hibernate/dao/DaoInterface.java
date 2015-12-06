package cfw.hibernate.dao;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 下午8:06:49
 */
public interface DaoInterface<T> {
	
	T findUniqueBy(Long id);
	T findUniqueBy(String name);
	
	void save(T t);
	
}
