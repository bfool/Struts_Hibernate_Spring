package com.city.erp.value;

import java.util.Set;

public class WarehouseValue {
	private int wno;
	private String wname;
	private Set<InventoryValue> inventorys = null;
	
	public int getWno() {
		return wno;
	}
	public void setWno(int wno) {
		this.wno = wno;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public Set<InventoryValue> getInventorys() {
		return inventorys;
	}
	public void setInventorys(Set<InventoryValue> inventorys) {
		this.inventorys = inventorys;
	}
	
}
