package com.city.oa.action;

import java.util.List;
import java.util.Map;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.EmployeeValue;
import com.opensymphony.xwork2.ActionContext;

public class EmployeeMainAction {
	private List<EmployeeValue> employeeList=null;
	private int low=0;
	private int high=0;
	private int rows=2;
	private int pageIndex=1;
	
	
	public List<EmployeeValue> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<EmployeeValue> employeeList) {
		this.employeeList = employeeList;
	}
	

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String tomain() throws Exception
	{
		
		IEmployeeBusiness eb=new EmployeeBusinessImpl();
		employeeList=eb.getListByAllWithPage(rows, pageIndex);
		System.out.println(employeeList.size());
		System.out.println(eb.getCountByAll());
		return "tomain";
		
	}
	
	public String toadd() throws Exception
	{
		 
		return "tomain";
	}
	public String tomodify() throws Exception
	{
		 
		return "tomodify";
	}
	public String todelete() throws Exception
	{
		 
		return "todelete";
	}
	
	public String toview() throws Exception
	{
		 
		return "tomain";
	}

}
