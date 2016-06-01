package com.city.erp.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.erp.business.IInventoryBusiness;
import com.city.erp.factory.HibernateFactory;
import com.city.erp.value.InventoryValue;
import com.city.erp.value.ProductValue;
import com.city.erp.value.WarehouseValue;

public class ProductBusinessImpl implements IInventoryBusiness {

	@Override
	public void add(String pid, int wno, int qty) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		InventoryValue iv = new InventoryValue();
		ProductValue pv = new ProductValue();
		pv.setPid(pid);
		
		iv.setQty(qty);
		WarehouseValue wv = new WarehouseValue();
		wv.setWno(wno);
		
		iv.setPid(pv);
		iv.setWno(wv);
		
		session.save(iv);
		
		tx.commit();
		session.close();
		sf.close();
	}

	@Override
	public List<WarehouseValue> getWarehouseListByProduct(String pid) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "select wv from InventoryValue iv inner join iv.wno wv inner join iv.pid pv where pv.pid = :pid";
		Query query = session.createQuery(hql);
		query.setString("pid", pid);
		List<WarehouseValue> list = query.list();
		
		tx.commit();
		session.close();
		sf.close();
		
		return list;
	}

	@Override
	public List<ProductValue> getProductListWithoutWarehouse() throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from ProductValue pv where pv not in (select pv from InventoryValue iv inner join iv.pid pv)";
		Query query = session.createQuery(hql);
		List<ProductValue> list = query.list();
		
		tx.commit();
		session.close();
		sf.close();
		
		return list;
	}

	@Override
	public double getProductTotalAmount() throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "select sum(pv.price*iv.qty) from InventoryValue iv inner join iv.pid pv";
		Query query = session.createQuery(hql);
		double t = Double.valueOf(query.uniqueResult().toString());
		
		tx.commit();
		session.close();
		sf.close();
		
		return t;
	}

	@Override
	public double getTotalAmountInWarehouse(int wno) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "select sum(pv.price*iv.qty) from InventoryValue iv inner join iv.pid pv inner join iv.wno wv where wv.wno = :wno";
		Query query = session.createQuery(hql);
		query.setDouble("wno", wno);
		double t = Double.valueOf(query.uniqueResult().toString());
		
		tx.commit();
		session.close();
		sf.close();
		
		return t;
	}

	@Override
	public List<WarehouseValue> getWarehouseListWithoutProduct() throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "select wv from WarehouseValue wv where wv not in (select wv from InventoryValue iv inner join iv.wno wv)";
		Query query = session.createQuery(hql);
		List<WarehouseValue> list = query.list();
		
		tx.commit();
		session.close();
		sf.close();
		
		return list;
	}

	@Override
	public double getTotalAmountByProduct(String pid) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "select sum(pv.price*iv.qty) from InventoryValue iv join iv.pid pv where iv.pid = :pid";
		Query query = session.createQuery(hql);
		query.setString("pid", pid);
		double t = Double.valueOf(query.uniqueResult().toString());
		
		tx.commit();
		session.close();
		sf.close();
		
		return t;
	}

	@Override
	public int getProductQTY(int pid) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "select qty from InventoryValue iv where iv.pid = :pid";
		Query query = session.createQuery(hql);
		query.setInteger("pid", pid);
		int t = Integer.valueOf(query.uniqueResult().toString());
		
		tx.commit();
		session.close();
		sf.close();
		
		return t;
	}

}
