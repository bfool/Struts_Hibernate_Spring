package com.demo.business;

import java.util.List;

import com.demo.value.AValue;

public interface IABusiness {
	public void add(AValue av) throws Exception;
	public void delete() throws Exception;
	public void update() throws Exception;
	public List getList() throws Exception;
	
}
