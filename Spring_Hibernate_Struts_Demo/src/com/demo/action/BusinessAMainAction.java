package com.demo.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.demo.business.IABusiness;
import com.demo.value.AValue;

@Controller("businessAMainAction")
@Scope("prototype")
public class BusinessAMainAction {
	
	private IABusiness ab = null;
	
	// 获得提供给表单的list
	private List<AValue> alist = null;
	
	@Autowired
	public void setAb(IABusiness ab) {
		this.ab = ab;
	}

	public List<AValue> getAlist() {
		return alist;
	}

	public void setAlist(List<AValue> alist) {
		this.alist = alist;
	}

	public String toadd() throws Exception {
		alist = ab.getList();
				
		return "toadd";
	}
	
	public String todelete() throws Exception {
		return "todelete";
	}
	
	public String toupdate() throws Exception {
		return "toupdate";
	}
	
	public String toview() throws Exception {
		return "toview";
	}
}
