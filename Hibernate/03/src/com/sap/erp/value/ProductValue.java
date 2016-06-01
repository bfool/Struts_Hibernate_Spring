package com.sap.erp.value;

import java.util.Date;

public class ProductValue {
	private int pno;
	private String pcode;
	private String pname;
	private Date pdate;
	private Date edate;
	private double unitprice;
	private double qtyinstock;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public double getQtyinstock() {
		return qtyinstock;
	}
	public void setQtyinstock(double qtyinstock) {
		this.qtyinstock = qtyinstock;
	}
	
}
