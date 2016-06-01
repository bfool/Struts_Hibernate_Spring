package com.city.office.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {
	public static SessionFactory createSessionFactory() throws Exception {
		SessionFactory sf = null;
		Configuration cfg = new Configuration();
		cfg.configure();
	
		sf = cfg.buildSessionFactory();
		
		return sf;
	}
}