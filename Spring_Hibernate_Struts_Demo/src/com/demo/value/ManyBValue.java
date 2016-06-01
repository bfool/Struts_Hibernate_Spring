package com.demo.value;

import java.util.Set;

public class ManyBValue {
	private int bid = 0;
	private String name = null;
	private Set<ManyAValue> as = null;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<ManyAValue> getAs() {
		return as;
	}
	public void setAs(Set<ManyAValue> as) {
		this.as = as;
	}
}
