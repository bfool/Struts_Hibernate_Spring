package com.city.crm.value;

import java.util.Set;

public class CourseValue {
	
	private int cno = 0;
	private String cname = null;
	private double credit = 0;
	private String cproperty = null;
	private Set<StudentValue> students = null;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public String getCproperty() {
		return cproperty;
	}
	public void setCproperty(String cproperty) {
		this.cproperty = cproperty;
	}
	public Set<StudentValue> getStudents() {
		return students;
	}
	public void setStudents(Set<StudentValue> students) {
		this.students = students;
	}
	
	
}
