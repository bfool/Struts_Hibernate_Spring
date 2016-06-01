package com.city.erp.value;

import java.util.Set;

public class ProductValue {
	private String pid;
	private String pname;
	private String model;
	private double price;
	private Set<InventoryValue> inventorys = null;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<InventoryValue> getInventorys() {
		return inventorys;
	}
	public void setInventorys(Set<InventoryValue> inventorys) {
		this.inventorys = inventorys;
	}
	
}
