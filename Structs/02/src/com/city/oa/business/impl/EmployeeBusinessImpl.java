package com.city.oa.business.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.factory.HibernateFactory;
import com.city.oa.value.EmployeeValue;
import com.opensymphony.xwork2.ActionContext;

public class EmployeeBusinessImpl implements IEmployeeBusiness {

	@Override
	public Boolean validate(String id, String pwd) throws Exception {
		boolean result = false;

		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		EmployeeValue ev = session.get(EmployeeValue.class, id);
		if (ev != null && ev.getPwd() != null && ev.getPwd().equals(pwd)) {
			result = true;
			ActionContext ac = ActionContext.getContext();
			Map session01 = ac.getSession();
			session01.put("userid", id);
		}
		tx.commit();
		session.close();
		sf.close();

		return result;
	}

}
