package com.city.oa.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory 
{
	private static SessionFactory sf=null;
	
	static
	{
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		
		sf=cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory(){
		return sf;
	}

}
