package com.city.oa.action;

import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class LogoutAction {
	public String logout() {
		HttpSession hs = ServletActionContext.getRequest().getSession();
		String id = (String) hs.getAttribute("userid");

		
		ServletContext application01 = ServletActionContext.getServletContext();
		Set<String> list = (Set)application01.getAttribute("userList");
		list.remove(id);
		application01.setAttribute("userList", list);
		return "login";
	}
}
