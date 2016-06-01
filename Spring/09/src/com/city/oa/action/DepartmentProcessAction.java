package com.city.oa.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.city.oa.business.IDepartmentBusiness;
import com.city.oa.business.impl.DepartmentBusinessImpl;
import com.city.oa.value.DepartmentValue;
import com.opensymphony.xwork2.ActionSupport;

public class DepartmentProcessAction extends ActionSupport {
	private DepartmentValue dv=null;
	
	
	public DepartmentValue getDv() {
		return dv;
	}

	public void setDv(DepartmentValue dv) {
		this.dv = dv;
	}

	public String add() throws Exception
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
		IDepartmentBusiness db=new DepartmentBusinessImpl();
		//IDepartmentBusiness db=ac.getBean("departmentBusiness",IDepartmentBusiness.class);
		
		db.add(dv);
		
		return "main";
	}
	
	public String modify() throws Exception
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
		//IDepartmentBusiness db=new DepartmentBusinessImpl();
		IDepartmentBusiness db=ac.getBean("departmentBusiness",IDepartmentBusiness.class);
		
		//db.modify(dv);
		return "main";
	}
	
	public String delete() throws Exception
	{
		IDepartmentBusiness db=new DepartmentBusinessImpl();
		db.delete(dv);
		return "main";
	}
}
