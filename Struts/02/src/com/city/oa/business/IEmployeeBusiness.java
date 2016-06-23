package com.city.oa.business;

import java.util.List;

import com.city.oa.value.EmployeeValue;

public interface IEmployeeBusiness {
	public Boolean validate(String id, String pwd) throws Exception;
	
}
