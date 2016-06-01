package com.city.oa.business;

import java.util.Date;
import java.util.List;

import com.city.oa.value.EmployeeValue;

public interface IEmployeeBusiness {
	//增加员工  粗粒度
	public void add(EmployeeValue ev) throws Exception;
	//增加员工  细粒度
	public void add(String id,String password,String name,int age,Date birthday,double salary,String sex,int departmentNo) throws Exception;
	//修改员工  粗粒度
	public void modify(EmployeeValue ev) throws Exception;
	//删除员工  粗粒度
	public void delete(EmployeeValue ev) throws Exception;
	//取得指定员工的信息
	public EmployeeValue gotEmployee(String id) throws Exception;
	//取得所有员工的列表
	public List<EmployeeValue> getListByAll() throws Exception;
	//取得所有员工的列表,分页方式
	public List<EmployeeValue> getListByAllWithPage(int rows,int pageIndex) throws Exception;
		
	//取得指定部门的员工列表
	public List<EmployeeValue> getListByDepartment(int departmentNo) throws Exception;
	//取得指定爱好的员工列表
	public List<EmployeeValue> getListByBehave(int behaveNo) throws Exception;
	//取得年龄在low和hight之间的员工列表
	public List<EmployeeValue> getListByAgeScope(int low,int high) throws Exception;
	//取得所有的员工人数
	public int getCountByAll() throws Exception;
	//取得指定部门的员工人数
	public int getCountByDepartment(int departmentNo) throws Exception;
	
	
	
	//增加员工的爱好，单个
	public void addBehave(String employeeId,int behaveNo) throws Exception;
	//增加员工的爱好，多个
	public void addBehaves(String employeeId,int[] behaves) throws Exception;
	//取得有爱好的员工列表
	public List<EmployeeValue> getListWithBehave() throws Exception; 
	//取得没有爱好的员工列表
	public List<EmployeeValue> getListWithoutBehave() throws Exception;
	//按姓名检束员工列表
	public List<EmployeeValue> getListBySearchName(String keyword) throws Exception;
	
	
	//取得指定爱好的员工列表
	
	//取得所有员工列表，分页方式
	
	//取得所有的员工的人数
	
	//取得指定部门的员工人数
	public int getEmployeeCountByDepartment(int departmentNo) throws Exception;
	//取得指定部门的员工人数
	public List<Long> getEmployeeCountByEachDepartment() throws Exception;
	//验证员工是否合法
	public boolean validate(String id,String password) throws Exception;
	//取得大于公司平均工资的员工列表
	public List<EmployeeValue> getListByGreatWholeAvgSalary() throws Exception;
	//取得大于本部门平均工资的员工列表
	public List<EmployeeValue> getListByGreatDepartmentAvgSalary() throws Exception;
	
	
	

}
