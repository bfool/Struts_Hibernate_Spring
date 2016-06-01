package com.city.oa.business;

import java.util.List;

import com.city.oa.value.BehaveValue;

//爱好业务接口
public interface IBehaveBusiness {
	
	public void add(BehaveValue bv) throws Exception;
	
	public void modify(BehaveValue bv) throws Exception;
	
	public void delete(BehaveValue bv) throws Exception;
	
	public BehaveValue getBehave(int behaveNo) throws Exception;
	
	public List<BehaveValue> getListByAll() throws Exception;
	
	public List<BehaveValue> getListByAllWithPage(int rows,int pageIndex) throws Exception;
	
	public int getCountByAll() throws Exception;
	
	public int getPageCountByAll(int rows) throws Exception;
	
	

}
