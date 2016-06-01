package com.city.oa.value;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//员工持久类DTO
import javax.persistence.Table;

@Entity
@Table(name="OA_Employee")

public class EmployeeValue implements Serializable {
	
	@Id
	@Column(name="EMPID")
	private String id=null;
	@Column(name="EMPPASSWORD")
	private String password=null;
	private String name=null;
	private String sex=null;
	private int age=0;
	private Date birthday=null;
	private Date joinDate=null;
	private double salary=0;
	private Blob photo=null;
	private String photoFileName=null;
	private String photoContentType=null;
	private DepartmentValue department=null;
	private Set<BehaveValue> behaves=null;
	private EmployeeAddressValue address=null;
	
	public EmployeeAddressValue getAddress() {
		return address;
	}
	public void setAddress(EmployeeAddressValue address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}
	public DepartmentValue getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentValue department) {
		this.department = department;
	}
	public Set<BehaveValue> getBehaves() {
		return behaves;
	}
	public void setBehaves(Set<BehaveValue> behaves) {
		this.behaves = behaves;
	}
	
	
	
	
	
	
}
