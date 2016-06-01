package com.city.oa.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.business.IStudentBusiness;
import com.city.oa.factory.HibernateFactory;
import com.city.oa.value.CourseValue;
import com.city.oa.value.StudentValue;

public class StudentBusinessImpl implements IStudentBusiness {

	@Override
	public void add(StudentValue sv) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(sv);
		
		tx.commit();
		
		session.close();
		
		sf.close();
		
	}

	@Override
	public void addCourse(String id, int courseNo) throws Exception {
		
	}

	@Override
	public void addCourses(String id, int[] courses) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		StudentValue sv = session.get(StudentValue.class, id);
		for(int i =0;i<courses.length;i++) {
			CourseValue cv = session.get(CourseValue.class, courses[i]);
			sv.getCourses().add(cv);
			cv.getStudents().add(sv);
		}
		
	
		tx.commit();
		
		session.close();
		
		sf.close();
		
	}

}
