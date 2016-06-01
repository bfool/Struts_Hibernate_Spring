package com.city.oa.test;

import java.util.List;

import com.city.oa.business.IDepartmentBusiness;
import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.DepartmentBusinessImpl;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.DepartmentValue;
import com.city.oa.value.EmployeeValue;

public class Test {

	public static void main(String[] args) {
	
		try
		{
			IDepartmentBusiness db=new DepartmentBusinessImpl();
			IEmployeeBusiness eb=new EmployeeBusinessImpl();
			//db.add("001", "财务部");
			List<EmployeeValue> list=eb.getListByDepartment(1);
			for(EmployeeValue ev:list){
				
				System.out.println(ev.getName());
				
				
			}
			System.out.println(list.size());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
