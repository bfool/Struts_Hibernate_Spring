package com.city.office.business.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.office.business.IBankBusiness;
import com.city.office.value.BankValue;

@Service("bankBusiness")
@Transactional
public class BankBusinessImpl implements IBankBusiness {

	private SessionFactory sf = null;
	
	@Autowired
	public BankBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void add(BankValue bv) throws Exception {
		Session session = sf.getCurrentSession();
		session.save(bv);
	}

}
