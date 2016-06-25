package com.city.erp.action;

import java.sql.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("productProcessAction")
@Scope("prototype")
public class ProductProcessAction extends ActionSupport {
	
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

	@Override
	public void validate() {
		if (name == null || name.equals("")) {
			addFieldError("name", "不能为空");
		}
		if (String.valueOf(id).length() < 8 || String.valueOf(id).length() > 12 ){
			addFieldError("id", "id必须为8-12位");
		}
	}

	public String add() throws Exception {
		
		return "main";
	}
}
