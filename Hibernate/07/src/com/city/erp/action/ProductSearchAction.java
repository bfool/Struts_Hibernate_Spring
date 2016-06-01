package com.city.erp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.city.erp.business.ProductBusiness;
import com.city.erp.business.impl.ProductBusinessImpl;
import com.city.erp.value.ProductValue;

public class ProductSearchAction {
	double low = 1;
	double high = 1000;
	int rows = 20;
	int pageIndex = 1;
	List<ProductValue> pv = null;
	
	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public List<ProductValue> getPv() {
		return pv;
	}

	public void setPv(List<ProductValue> pv) {
		this.pv = pv;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	public String getPage(){
		ProductBusiness pb = new ProductBusinessImpl();
		try {
			if(pageIndex<1){
				pageIndex = 1;
			}
			
			pv = pb.getListByPriceWithPage(low, high, rows, pageIndex);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}
