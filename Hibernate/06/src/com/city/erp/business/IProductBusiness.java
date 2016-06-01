package com.city.erp.business;

import com.city.erp.value.ProductValue;

public interface IProductBusiness {
	public void add(int cno, String name, double unitprice, int qty) throws Exception;
	public void modify(int pno, String name, int cno, double unitprice, int qty) throws Exception;
	public void changePrice(int pno, double unitprice) throws Exception;
	public double getPriceByProduct(int pno) throws Exception;
	public void delete(int pno) throws Exception;
	public ProductValue getProduct(int pno) throws Exception;
	public double getAmountByProduct(int pno) throws Exception;
	public double getTotalAmountByCategory(int cno) throws Exception;
	public boolean checkProductInCategory(int pno, int cno) throws Exception;
}
