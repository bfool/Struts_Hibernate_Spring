package com.sap.erp.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sap.erp.business.ICompanyTypeBusiness;
import com.sap.erp.value.CompanyTypeValue;

@Service("companyTypeBusiness")
@Transactional
public class CompanyTypeImpl implements ICompanyTypeBusiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public CompanyTypeImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<CompanyTypeValue> getAllList() throws Exception {
		String hql = "from CompanyTypeValue";
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		
		return query.list();
	}

}
