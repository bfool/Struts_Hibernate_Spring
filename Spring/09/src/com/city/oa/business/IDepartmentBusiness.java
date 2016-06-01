package com.city.oa.business;

import java.util.List;

import com.city.oa.value.DepartmentValue;

public interface IDepartmentBusiness {
	
	public void add(String code,String name) throws Exception;
	
	public void add(DepartmentValue dv) throws Exception;
	
	public void modify(DepartmentValue dv) throws Exception;
	public void modify(int no,String code,String name) throws Exception;
	
	
	public void delete(DepartmentValue dv) throws Exception;
	
	public DepartmentValue getDepartment(int no) throws Exception;
	//取得所有部门列表，不获取关联的员工对象
	public List<DepartmentValue> getListAllWithoutEmployees() throws Exception;
	//取得所有部门列表，直接获取关联的员工对象
	public List<DepartmentValue> getListAllWithEmployees() throws Exception;
	
	
}
