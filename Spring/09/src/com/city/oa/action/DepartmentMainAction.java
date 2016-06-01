package com.city.oa.action;

import java.util.List;

import com.city.oa.business.IDepartmentBusiness;
import com.city.oa.business.impl.DepartmentBusinessImpl;
import com.city.oa.value.DepartmentValue;

public class DepartmentMainAction
{
	IDepartmentBusiness db=new DepartmentBusinessImpl();
	private List<DepartmentValue> departmentList=null;
	private DepartmentValue dv=null;
	
	
	
	 public List<DepartmentValue> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<DepartmentValue> departmentList) {
		this.departmentList = departmentList;
	}
	
	public DepartmentValue getDv() {
		return dv;
	}
	public void setDv(DepartmentValue dv) {
		this.dv = dv;
	}
	public String tomain() throws Exception
	 {
		 departmentList=db.getListAllWithoutEmployees();
		 
		 return "tomain";
	 }
	
	public String tolist() throws Exception
	{
		departmentList=db.getListAllWithoutEmployees();
		return "tolist";
	}
	 public String toadd() throws Exception
	 {
		 
		 return "toadd";
	 }
	 public String tomodify() throws Exception
	 {
		 
		 return "tomodify";
	 }
	 public String todelete() throws Exception
	 {
		 
		 return "todelete";
	 }
	 public String toGetDepartment() throws Exception
	 {
		 dv=db.getDepartment(dv.getNo());
		 System.out.println(dv.getCode());
		 return "toGetDepartment";
	 }
	 public String toview() throws Exception
	 {
		 dv=db.getDepartment(dv.getNo());
		 
		 return "toview";
	 }

}
