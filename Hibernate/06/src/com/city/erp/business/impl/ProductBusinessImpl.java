package com.city.erp.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.erp.business.IProductBusiness;
import com.city.erp.factory.HibernateFactory;
import com.city.erp.value.CategoryValue;
import com.city.erp.value.ProductValue;

public class ProductBusinessImpl implements IProductBusiness {

	@Override
	public void add(int cno, String name, double unitprice, int qty) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		CategoryValue cv = new CategoryValue();
		cv.setCno(cno);
		ProductValue pv = new ProductValue();
		pv.setCno(cv);
		pv.setPname(name);
		pv.setUnitprice(unitprice);
		pv.setQty(qty);
		
		session.save(pv);
		
		tx.commit();
		
		session.close();
		
		sf.close();		
	}

	@Override
	public void modify(int pno, String name, int cno, double unitprice, int qty) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		ProductValue pv = session.get(ProductValue.class, pno);
		CategoryValue cv = new CategoryValue();
		cv.setCno(cno);
		pv.setCno(cv);
		pv.setPname(name);
		pv.setUnitprice(unitprice);
		pv.setQty(qty);
		
		session.update(pv);
		
		tx.commit();
		
		session.close();
		
		sf.close();	
	}

	@Override
	public void changePrice(int pno, double unitprice) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		ProductValue pv = session.get(ProductValue.class, pno);
		pv.setUnitprice(unitprice);
		
		session.update(pv);
		
		tx.commit();
		
		session.close();
		
		sf.close();	
		
	}

	@Override
	public double getPriceByProduct(int pno) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		double price = 0;
		ProductValue pv = session.get(ProductValue.class, pno);
		price = pv.getUnitprice();
		
		tx.commit();
		
		session.close();
		
		sf.close();	
		return price;
	}

	@Override
	public void delete(int pno) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		ProductValue pv = session.get(ProductValue.class, pno);
		session.delete(pv);
		
		tx.commit();
		
		session.close();
		
		sf.close();		
		
	}

	@Override
	public ProductValue getProduct(int pno) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		ProductValue pv = session.get(ProductValue.class, pno);
		
		tx.commit();
		
		session.close();
		
		sf.close();	
		return pv;
	}

	@Override
	public double getAmountByProduct(int pno) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		ProductValue pv = session.get(ProductValue.class, pno);
		double amount = pv.getUnitprice() * pv.getQty();
		
		session.save(pv);
		
		tx.commit();
		
		session.close();
		
		sf.close();	
		return amount;
	}

	@Override
	public double getTotalAmountByCategory(int cno) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		double t = 0;
		CategoryValue cv = session.get(CategoryValue.class, cno);
		for(ProductValue pv : cv.getProducts()) {
			t += pv.getUnitprice()*pv.getQty();
		}
		tx.commit();
		
		session.close();
		
		sf.close();	
		return  t;
	}

	@Override
	public boolean checkProductInCategory(int pno, int cno) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		boolean isIn = false;
		CategoryValue cv = session.get(CategoryValue.class, cno);
		ProductValue pv = session.get(ProductValue.class, pno);
		if(pv.getCno() == cv) {
			isIn = true;
		}
		tx.commit();
		
		session.close();
		
		sf.close();	
		return isIn;
	}



}
