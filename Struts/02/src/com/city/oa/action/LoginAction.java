package com.city.oa.action;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.EmployeeValue;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String id = null;
	private String pwd = null;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String login() throws Exception {

		if (id != null && id.trim().length() != 0 && pwd != null && pwd.trim().length() != 0) {
			IEmployeeBusiness ieb = new EmployeeBusinessImpl();
			if (ieb.validate(id, pwd)) {
				System.out.println("aa");
				ActionContext ac = ActionContext.getContext();
				Map session = ac.getSession();
				session.put("userid", id);
				Map application = ac.getApplication();
				application.put("onlinenum", 1);
				// 耦合方式访问Servlet API
				

				// 取得ServletContext（应用服务器对象）对象
				ServletContext application01 = ServletActionContext.getServletContext();
				Set<String> userList = (Set)application01.getAttribute("userList");
				boolean isLogin = false;
				if(userList == null) {
					System.out.println("bb");
					userList = new HashSet<String>();
					userList.add(id);
					application01.setAttribute("userList", userList);
				} else {
					System.out.println("cc");
					userList.add(id);
					isLogin = true;
					return "main";
				}
				if(!isLogin) {
					System.out.println("dd");
					return "main";
				}
			} else {
				return "login";
			}
		}
		return "login";
	}	
}