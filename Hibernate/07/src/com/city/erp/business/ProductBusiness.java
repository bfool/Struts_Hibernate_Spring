package com.city.erp.business;

import java.util.List;

public interface ProductBusiness {
	public List getListByPriceWithPage(double low,double high,int rows,int pageIndex) throws Exception;
}
