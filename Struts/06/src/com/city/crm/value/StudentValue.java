package com.city.crm.value;

public class StudentValue {
	private int sid = 0;
	private int sno = 0;
	private String sname = null;
	private double ordinaryscore = 0;
	private double endingscore = 0;
	private CourseValue cno = null;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getOrdinaryscore() {
		return ordinaryscore;
	}
	public void setOrdinaryscore(double ordinaryscore) {
		this.ordinaryscore = ordinaryscore;
	}
	public double getEndingscore() {
		return endingscore;
	}
	public void setEndingscore(double endingscore) {
		this.endingscore = endingscore;
	}
	public CourseValue getCno() {
		return cno;
	}
	public void setCno(CourseValue cno) {
		this.cno = cno;
	}
	
}
