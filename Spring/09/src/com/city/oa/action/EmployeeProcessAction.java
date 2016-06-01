package com.city.oa.action;

import java.io.File;
import java.util.Date;
import java.util.Map;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.EmployeeValue;
import com.opensymphony.xwork2.ActionContext;

public class EmployeeProcessAction {
	
	private EmployeeValue ev=null;
	private File photo=null;
	private int[] behaves=null;
	
	
	public EmployeeValue getEv() {
		return ev;
	}
	public void setEv(EmployeeValue ev) {
		this.ev = ev;
	}
	public int[] getBehaves() {
		return behaves;
	}
	public void setBehaves(int[] behaves) {
		this.behaves = behaves;
	}
	
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String add() throws Exception
	{
		
		IEmployeeBusiness eb=new EmployeeBusinessImpl();
		
		eb.add(ev);
		eb.addBehaves(ev.getId(), behaves);
		
		return "success";
		
	}
	
	public String modify() throws Exception
	{
		IEmployeeBusiness eb=new EmployeeBusinessImpl();
		
		
		
		return "success";
	}
	
	public String delete() throws Exception
	{
		
		IEmployeeBusiness eb=new EmployeeBusinessImpl();
		
		
		
		return "success";
	}
	

}
