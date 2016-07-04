package com.city.erp.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("homeMainAction")
@Scope("prototype")
public class HomeMainAction {
	
	public String tomain() throws Exception {
		return "tomain";
	}
}
