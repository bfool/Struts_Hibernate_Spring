package com.sap.erp.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sap.erp.business.ICategoryBusiness;

@Service("categorybusiness")
@Transactional
public class CategoryImpl implements ICategoryBusiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public CategoryImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List getAllList() throws Exception {
		Session session = sf.getCurrentSession();
		String hql = "from IndustryCategoryValue";
		Query query = session.createQuery(hql);
		
		return query.list();
	}

}
