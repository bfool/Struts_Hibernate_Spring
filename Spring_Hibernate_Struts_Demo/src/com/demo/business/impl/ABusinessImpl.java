package com.demo.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.business.IABusiness;
import com.demo.value.AValue;

@Service("aBusiness")
@Transactional
public class ABusinessImpl implements IABusiness {

	private SessionFactory sf = null;

	@Autowired
	public ABusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(AValue av) throws Exception {
		Session session = sf.getCurrentSession();

		session.save(av);

	}
	
	@Override
	public void delete() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List getList() throws Exception {
		String hql = "from AValue";
		Session session = sf.getCurrentSession();

		Query query = session.createQuery(hql);
		List<AValue> list = query.list();

		return list;
	}


}
