package com.city.erp.value;

import java.sql.Date;

public class ProductValue {
	private int id = 0;
	private String name = null;
	private int savedate = 0;
	private double price = 0;
	private Date date = null;
	private String email = null;
	private String web = null;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSavedate() {
		return savedate;
	}
	public void setSavedate(int savedate) {
		this.savedate = savedate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
}
