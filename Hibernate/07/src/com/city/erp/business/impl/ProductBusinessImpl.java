package com.city.erp.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.city.erp.business.ProductBusiness;
import com.city.erp.value.ProductValue;

public class ProductBusinessImpl implements ProductBusiness {

	@Override
	public List getListByPriceWithPage(double low, double high, int rows,
			int pageIndex) throws Exception {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from Products pv where pv.UnitPrice between :low and :high";
		Query query=session.createQuery(hql);
		query.setDouble("low", low);
		query.setDouble("high", high);
		query.setFirstResult((pageIndex-1)*rows);
		query.setMaxResults(rows);
		List<ProductValue> list=query.list();
		
		tx.commit();
		session.close();
		return list;
	}

}
