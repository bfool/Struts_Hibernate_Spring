package com.city.erp.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.erp.business.IProductBusiness;
import com.city.erp.factory.HibernateFactory;
import com.city.erp.value.ProductValue;

public class ProductBusinessImpl implements IProductBusiness {

	@Override
	public void add(ProductValue pv) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pv);
		
		tx.commit();
		session.close();
		sf.close();
	}

}
