package com.demo.value;

import java.util.Set;

public class ManyAValue {
	private int aid = 0;
	private String name = null;
	private Set<ManyBValue> bs = null;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<ManyBValue> getBs() {
		return bs;
	}
	public void setBs(Set<ManyBValue> bs) {
		this.bs = bs;
	}
}
