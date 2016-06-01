package com.city.oa.value;

import java.util.Date;

public class EmployeeValue {
	private String eid;
	private String ename;
	private int eage;
	private double esal;
	private Date ejoindate;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Date getEjoindate() {
		return ejoindate;
	}
	public void setEjoindate(Date ejoindate) {
		this.ejoindate = ejoindate;
	}

}
