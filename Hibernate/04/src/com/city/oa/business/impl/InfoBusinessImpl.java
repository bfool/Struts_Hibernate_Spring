package com.city.oa.business.impl;

import java.util.Locale.Category;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.factory.HibernateFactory;
import com.city.oa.value.CategoryValue;
import com.city.oa.value.InfoValue;


public class InfoBusinessImpl {
	
	public void add(int gno, String subject, String content, String infoDate) throws Exception {
		InfoValue iv = new InfoValue();
		CategoryValue cv = new CategoryValue();
		
		cv.setGno(gno);
		iv.setGno(cv);
		iv.setContent(content);
		iv.setSubject(subject);
		iv.setInfodate(infoDate);
		
		SessionFactory sf = HibernateFactory.createSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(iv);
		
		tx.commit();
		session.close();
		sf.close();
	}
	
	public void add(InfoValue iv) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(iv);
		
		tx.commit();
		session.close();
		sf.close();
	}
	
}
