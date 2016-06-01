package com.city.erp.value;

import java.io.Serializable;

public class ProductValue{
	private int pno;
	private String pname;
	private double unitprice;
	private int qty;
	private CategoryValue cno;
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public CategoryValue getCno() {
		return cno;
	}
	public void setCno(CategoryValue cno) {
		this.cno = cno;
	}
		
}
