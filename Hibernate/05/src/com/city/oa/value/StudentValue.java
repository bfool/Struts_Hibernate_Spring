package com.city.oa.value;

import java.io.Serializable;
import java.util.Set;

public class StudentValue implements Serializable{
	
	private String ssid;
	private String sname;
	private String sex;
	private int age;
	private Set<CourseValue> courses=null;
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<CourseValue> getCourses() {
		return courses;
	}
	public void setCourses(Set<CourseValue> courses) {
		this.courses = courses;
	}
	
}
