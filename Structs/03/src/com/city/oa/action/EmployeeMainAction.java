package com.city.oa.action;

import java.util.List;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.EmployeeValue;

public class EmployeeMainAction {
	IEmployeeBusiness eb = new EmployeeBusinessImpl();
	private List<EmployeeValue> evList = null;
	private EmployeeValue ev = null;
	
	public List<EmployeeValue> getEvList() {
		return evList;
	}

	public void setEvList(List<EmployeeValue> evList) {
		this.evList = evList;
	}

	public EmployeeValue getEv() {
		return ev;
	}

	public void setEv(EmployeeValue ev) {
		this.ev = ev;
	}

	public String tomain() {
		
		return "tomain";
	}
	
	public String toadd() {
		
		return "toadd";
	}
	
	public String tomodify() {
		
		return "tomodify";
	}
	
	public String todelete() {
		
		return "todelete";
	}
	
	public String toview() {
		
		return "toview";
	}
}

