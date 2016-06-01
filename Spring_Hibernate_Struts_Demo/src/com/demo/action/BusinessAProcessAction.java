package com.demo.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.demo.business.IABusiness;
import com.demo.value.AValue;

@Controller("businessAProcessAction")
@Scope("prototype")
public class BusinessAProcessAction {
	
	private IABusiness ab = null;
	private AValue av = null;
	
	@Autowired
	public void setAb(IABusiness ab) {
		this.ab = ab;
	}
	
	public AValue getAv() {
		return av;
	}

	public void setAv(AValue av) {
		this.av = av;
	}

	public String add() throws Exception {
		//	实现业务A相关add的业务逻辑
		ab.add(av);
		return "main";
	}
	
	public String delete() throws Exception {
		//	实现业务A相关delete的业务逻辑
		return "main";
	}
	
	public String update() throws Exception {
		//	实现业务A相关update的业务逻辑
		return "main";
	}
	
	public String view() throws Exception {
		//	实现业务A相关view的业务逻辑
		return "main";
	}
}
