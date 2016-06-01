package com.city.erp.value;

import java.io.Serializable;
import java.util.Set;

public class CategoryValue {
	private int cno;
	private String cname;
	private Set<ProductValue> products;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<ProductValue> getProducts() {
		return products;
	}
	public void setProducts(Set<ProductValue> products) {
		this.products = products;
	}
	
}
