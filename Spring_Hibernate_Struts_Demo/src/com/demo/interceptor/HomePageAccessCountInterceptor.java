package com.demo.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HomePageAccessCountInterceptor implements Interceptor {
	
	private int count;

	@Override
	public void destroy() {
		System.out.println("主页访问次数检查拦截器销毁。。。");
	}

	@Override
	public void init() {
		count = 0;
		System.out.println("主页访问次数检查拦截器初始化。。。");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		session.put("HomePageCount", ++count);
		return ai.invoke();
		
		//if error
		// return "toerror";
	}

}
