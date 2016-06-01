package com.ibm.erp.baseinfo.action;

import com.ibm.erp.baseinfo.business.IProductBusiness;
import com.ibm.erp.baseinfo.business.impl.ProductBusinessImpl;

public class ProductProcessAction {
	
	private String name;
	private String price;
	private String unit;
	private String qty;
	private String buynum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getBuynum() {
		return buynum;
	}

	public void setBuynum(String buynum) {
		this.buynum = buynum;
	}

	public String add() throws Exception {
		IProductBusiness ib = new ProductBusinessImpl();
		ib.add(name, Double.valueOf(price), unit, Integer.valueOf(qty), Integer.valueOf(buynum));
		
		return "success";
	}
	
}
