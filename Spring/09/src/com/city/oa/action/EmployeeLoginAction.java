package com.city.oa.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.EmployeeValue;
import com.opensymphony.xwork2.ActionContext;

public class EmployeeLoginAction {
	private IEmployeeBusiness employeeBusiness=new EmployeeBusinessImpl();
	private String id=null;
	private String password=null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() throws Exception
	{
		if(id==null||id.trim().length()==0){
			return "login";
		}
		else if(password==null||password.trim().length()==0){
			return "login";
		}
		else if(!employeeBusiness.validate(id, password)){
			return "login";
		}
		else{
			//非耦合
			EmployeeValue ev=employeeBusiness.gotEmployee(id);
			ActionContext ac=ActionContext.getContext();
			Map session=ac.getSession();
			session.put("user", ev);
			Map application=ac.getApplication();
			ac.put("onlinenum", 1);
			//Map request=(Map)ac.get("request");
			//request.put("requesttime", 1);
			//耦合方式访问Servlet API
			//取得请求对象
			//HttpServletRequest req=ServletActionContext.getRequest();
			//req.setAttribute("user",id);
			//取得会话对象
			//HttpSession session01=ServletActionContext.getRequest().getSession();
			//session01.setAttribute("user",id);
			
			//取得ServletContext（应用服务器对象）对象
			ServletContext application01=ServletActionContext.getServletContext();
			return "main";
		}
		
	}

}
