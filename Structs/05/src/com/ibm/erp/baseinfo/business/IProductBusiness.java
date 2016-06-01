package com.ibm.erp.baseinfo.business;

public interface IProductBusiness {
	
	public void add(String name, double price, String unit, int qty, int buynum) throws Exception;
}
