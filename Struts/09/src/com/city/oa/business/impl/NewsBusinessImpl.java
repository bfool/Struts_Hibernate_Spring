package com.city.oa.business.impl;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;

import org.hibernate.LobHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.oa.business.INewsBuesiness;
import com.city.oa.value.NewsValue;

@Service("newsbusiness")
@Transactional
public class NewsBusinessImpl implements INewsBuesiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public NewsBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(NewsValue nv) throws Exception {
		Session session = sf.getCurrentSession();
		session.save(nv);
		
	}

	@Override
	public void add(NewsValue nv, File photo, String fileName, String contentType) throws Exception {
		nv.setPhotoFileName(fileName);
		nv.setPhotoContentType(contentType);
		
		LobHelper lh = sf.getCurrentSession().getLobHelper();
		InputStream in = new FileInputStream(photo);
		Blob bphoto = lh.createBlob(in, in.available());
		nv.setPhoto(bphoto);
		
		sf.getCurrentSession().save(nv);
	}

	@Override
	public NewsValue getNews(int no) throws Exception {
		Session session = sf.getCurrentSession();
		NewsValue nv = session.get(NewsValue.class, no);
		return nv;
	}
	
}
