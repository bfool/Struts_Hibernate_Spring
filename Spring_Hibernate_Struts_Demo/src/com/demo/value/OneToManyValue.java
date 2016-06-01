package com.demo.value;

import java.util.Set;

public class OneToManyValue {
	private int oid = 0;
	private String name = null;
	private Set<ManyToOneValue> ones = null;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<ManyToOneValue> getOnes() {
		return ones;
	}
	public void setOnes(Set<ManyToOneValue> ones) {
		this.ones = ones;
	}
	
}
