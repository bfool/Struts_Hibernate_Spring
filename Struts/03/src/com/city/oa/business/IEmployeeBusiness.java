package com.city.oa.business;

import com.city.oa.value.EmployeeValue;

public interface IEmployeeBusiness {
	public void add(EmployeeValue ev) throws Exception;
	public boolean hasEmployeeId(String id) throws Exception;
}
