package com.city.crm.business.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.crm.business.IScoreBusiness;
import com.city.crm.factory.HibernateFactory;
import com.city.crm.value.CourseValue;
import com.city.crm.value.StudentValue;


public class ScoreBusinessImpl implements IScoreBusiness {


	@Override
	public void add(CourseValue cv, List<StudentValue> sv) throws Exception {
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(cv);
		for(StudentValue s : sv) {
			s.setCno(cv);
			session.save(s);
		}
		
		tx.commit();
		session.close();
		sf.close();
		
	}

}
