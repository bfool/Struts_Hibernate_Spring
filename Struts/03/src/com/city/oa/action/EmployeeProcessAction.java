package com.city.oa.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.EmployeeValue;

public class EmployeeProcessAction {

	private EmployeeValue ev = null;
	private String joindate = null;

	public EmployeeValue getEv() {
		return ev;
	}

	public void setEv(EmployeeValue ev) {
		this.ev = ev;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String add() throws Exception {
		IEmployeeBusiness eb = new EmployeeBusinessImpl();

		if (eb.hasEmployeeId(ev.getEid())) {
			return "toadd";
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(joindate);
			ev.setEjoindate(date);
			eb.add(ev);

		}
		return "main";
	}
}
