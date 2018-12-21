package JY.Dao.Impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import JY.Dao.BaseDao;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{

	private Class clazz;
	
	public BaseDaoImpl() {
		Class clazz=this.getClass();
		Type type = clazz.getGenericSuperclass();
		ParameterizedType PType=(ParameterizedType) type;
		Type[] types = PType.getActualTypeArguments();
		this.clazz = (Class) types[0];
		System.out.println(this.clazz);
	}

	@Override
	public void save(T t) {

		getHibernateTemplate().save(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(t);
	}

	@Override
	public void update(T t) {
		getHibernateTemplate().update(t);
		
	}

}
