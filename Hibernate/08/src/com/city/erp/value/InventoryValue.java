package com.city.erp.value;

public class InventoryValue {
	private int invno;
	private ProductValue pid;
	private WarehouseValue wno;
	private int qty;
	
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public ProductValue getPid() {
		return pid;
	}
	public void setPid(ProductValue pid) {
		this.pid = pid;
	}
	public WarehouseValue getWno() {
		return wno;
	}
	public void setWno(WarehouseValue wno) {
		this.wno = wno;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
