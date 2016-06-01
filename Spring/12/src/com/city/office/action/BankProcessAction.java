package com.city.office.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.city.office.business.IBankBusiness;
import com.city.office.value.BankValue;

@Controller("bankProcessAction")
@Scope("prototype")
public class BankProcessAction {

	private BankValue bv = null;
	private IBankBusiness bb = null;
	
	@Autowired
	public void setBb(IBankBusiness bb) {
		this.bb = bb;
	}

	public BankValue getBv() {
		return bv;
	}
	
	public void setBv(BankValue bv) {
		this.bv = bv;
	}
	
	public String add() throws Exception {
		
		bb.add(bv);
		return "tomain";
	}
}
