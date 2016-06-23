package com.ibm.erp.baseinfo.business.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.erp.baseinfo.business.IProductBusiness;
import com.ibm.erp.factory.HibernateFactory;
import com.ibm.erp.value.ProductValue;

public class ProductBusinessImpl implements IProductBusiness{

	@Override
	public void add(String name, double price, String unit, int qty, int buynum) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		ProductValue pv = new ProductValue();
		pv.setName(name);
		pv.setPrice(price);
		pv.setUnit(unit);
		pv.setQty(qty);
		pv.setBuynum(buynum);
		
		session.save(pv);
		
		tx.commit();
		session.close();
		sf.close();
	}

}
