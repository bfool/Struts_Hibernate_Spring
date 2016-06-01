package com.city.oa.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
//员工登录检查拦截器
public class EmployeeLoginCheckInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("员工登录检查拦截器销毁。。。");
	}

	@Override
	public void init() {
		System.out.println("员工登录检查拦截器初始化。。。");

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("员工登录检查拦截器拦截方法。。。");
		Map session=ActionContext.getContext().getSession();
		if(session.get("user")==null){
			return "login";
		}
		else{
			String result=ai.invoke();
			return result;
		}
		
		
	}

}
