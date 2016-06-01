package com.city.oa.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class EmployeeLogoutAction {
	
	public String logout() throws Exception
	{
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.invalidate();
		
		return "login";
		
	}

}
