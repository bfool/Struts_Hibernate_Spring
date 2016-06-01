package com.sap.erp.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sap.erp.business.ICategoryBusiness;
import com.sap.erp.business.ICompanyTypeBusiness;
import com.sap.erp.value.CompanyTypeValue;
import com.sap.erp.value.IndustryCategoryValue;

public class SupplierMainAction {
	
	ICategoryBusiness icb = null;
	ICompanyTypeBusiness ctb = null;
	
	private List<CompanyTypeValue> typeList = null;
	private List<IndustryCategoryValue> categoryList = null;
	
	public List<CompanyTypeValue> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<CompanyTypeValue> typeList) {
		this.typeList = typeList;
	}

	public List<IndustryCategoryValue> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<IndustryCategoryValue> categoryList) {
		this.categoryList = categoryList;
	}

	public SupplierMainAction() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		icb = ac.getBean("categorybusiness", ICategoryBusiness.class);
		ctb = ac.getBean("companyTypeBusiness", ICompanyTypeBusiness.class);
	}
	
	public String toadd() throws Exception {
		
		typeList = ctb.getAllList();
		categoryList = icb.getAllList();
		
		return "toadd";
	}
}
