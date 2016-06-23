package com.city.web.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.web.business.IIPBusiness;
import com.city.web.factory.HibernateFactory;
import com.city.web.value.IPValue;

public class IPBusiness implements IIPBusiness {

	@Override
	public boolean checkIP(String ip) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		boolean checked = false;
		if(session.get(IPValue.class, ip) != null) {
			System.out.println("ip right");
			checked = true;
		}
		
		tx.commit();
		session.close();
		sf.close();
		
		return checked;
	}

}
