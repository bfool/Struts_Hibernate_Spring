package com.demo.value;

public class ManyToOneValue {
	private int mid = 0;
	private String name = null;
	private OneToManyValue many = null;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OneToManyValue getMany() {
		return many;
	}
	public void setMany(OneToManyValue many) {
		this.many = many;
	}
	
}
