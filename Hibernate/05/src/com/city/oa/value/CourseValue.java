package com.city.oa.value;

import java.io.Serializable;
import java.util.Set;

public class CourseValue implements Serializable {
	
	private int cno;
	private String cname;
	private int credit;
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
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Set<StudentValue> getStudents() {
		return students;
	}
	public void setStudents(Set<StudentValue> students) {
		this.students = students;
	}
	 
}
