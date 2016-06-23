package com.city.oa.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.business.IUserBusiness;
import com.city.oa.factory.HibernateFactory;
import com.city.oa.value.UserValue;

public class UserBusinessImpl implements IUserBusiness {

	@Override
	public void add(UserValue uv) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(uv);
		
		tx.commit();
		
		session.close();
		
		sf.close();
		
	}

}
