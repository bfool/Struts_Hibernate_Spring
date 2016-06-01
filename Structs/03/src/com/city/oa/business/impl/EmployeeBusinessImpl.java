package com.city.oa.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.factory.HibernateFactory;
import com.city.oa.value.EmployeeValue;

public class EmployeeBusinessImpl implements IEmployeeBusiness {

	@Override
	public void add(EmployeeValue ev) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(ev);
		
		tx.commit();
		session.close();
		sf.close();
	}

	@Override
	public boolean hasEmployeeId(String id) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		boolean ishas = false;
		if(session.get(EmployeeValue.class, id) != null) {
			ishas = true;
		}
		
		tx.commit();
		session.close();
		sf.close();
		
		return ishas;
	}

}
