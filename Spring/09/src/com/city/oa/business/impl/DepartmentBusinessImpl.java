package com.city.oa.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.city.oa.business.IDepartmentBusiness;
import com.city.oa.factory.HibernateFactory;
import com.city.oa.value.DepartmentValue;
//部门的业务实现类
public class DepartmentBusinessImpl implements IDepartmentBusiness {

	
	private SessionFactory sf=null;
	public DepartmentBusinessImpl(){
		
	}
	public DepartmentBusinessImpl(SessionFactory sf){
		this.sf=sf;
	}
	
	
	/*
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
    */
	@Override
	public void add(String code, String name) throws Exception {
		
		
				
		//SessionFactory sf=HibernateFactory.getSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		DepartmentValue dv=new DepartmentValue();
		dv.setCode(code);
		dv.setName(name);
			
		session.save(dv);
			
		tx.commit();
		
		session.close();
	}

	@Override
	public void add(DepartmentValue dv) throws Exception {
		
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
			
		session.save(dv);
		
		tx.commit();
		
		session.close();
		
		sf.close();
		

	}

	@Override
	public void modify(DepartmentValue dv) throws Exception {
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
			
		session.update(dv);
		
		tx.commit();
		
		session.close();
		
		
		
		
	}
	@Override
	public void modify(int no, String code, String name) throws Exception {
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		DepartmentValue dv=session.get(DepartmentValue.class,no);
			
		dv.setCode(code);
		dv.setName(name);
				
		
		tx.commit();
		
		session.close();
		
		
		
		
	}

	
	@Override
	public void delete(DepartmentValue dv) throws Exception {
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		DepartmentValue dv01=session.load(DepartmentValue.class, dv.getNo());
			
		session.delete(dv01);
		
		tx.commit();
		
		session.close();
		
		sf.close();
		
	}

	@Override
	public DepartmentValue getDepartment(int no) throws Exception {
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
			
		DepartmentValue dv=session.get(DepartmentValue.class, no);
		
		tx.commit();
		
		session.close();
		
		sf.close();
		
		return dv;
	}

	@Override
	public List<DepartmentValue> getListAllWithoutEmployees() throws Exception {
		
		String hql="from DepartmentValue";
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery(hql);
		List<DepartmentValue> list=query.list();
		
		tx.commit();
		session.close();
		
		return list;
	}

	@Override
	public List<DepartmentValue> getListAllWithEmployees() throws Exception {
		
		SessionFactory sf=HibernateFactory.getSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		String hql="from DepartmentValue dv left outer join  dv.employees ev";
		Query query=session.createQuery(hql);
		List<DepartmentValue> list=query.list();
		
		tx.commit();
		session.close();
		return list;
	}

	
}
