package com.city.oa.value;

import java.io.Serializable;
import java.util.Set;

//部门DTO持久类
public class DepartmentValue implements Serializable {
	private int no=0; //编号 主键 自增量
	private String code=null; //编码
	private String name=null; //部门名称
	private Set<EmployeeValue> employees=null;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<EmployeeValue> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<EmployeeValue> employees) {
		this.employees = employees;
	}
	
	
}
