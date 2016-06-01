package com.city.erp.action;

import com.city.erp.business.IInventoryBusiness;
import com.city.erp.business.impl.ProductBusinessImpl;
import com.city.erp.value.ProductValue;
import com.city.erp.value.WarehouseValue;

public class ProductMainAction {
	public static void main(String[] args) throws Exception {
		IInventoryBusiness ib = new ProductBusinessImpl();
//		ib.add("2", 1, 10);
		ib.getWarehouseListByProduct("1");
		for(ProductValue pv : ib.getProductListWithoutWarehouse()) {
			System.out.println(pv.getPid() + "," + pv.getPname());
		}
		System.out.println(ib.getProductTotalAmount());
		System.out.println(ib.getTotalAmountInWarehouse(2));
		for(WarehouseValue wv : ib.getWarehouseListWithoutProduct()) {
			System.out.println(wv.getWno() + "," +wv.getWname());
		}
		System.out.println(ib.getTotalAmountByProduct("1"));
		System.out.println(ib.getProductQTY(1));
	}
}
