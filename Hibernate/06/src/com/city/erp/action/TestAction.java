package com.city.erp.action;

import com.city.erp.business.IProductBusiness;
import com.city.erp.business.impl.ProductBusinessImpl;

public class TestAction {
	public static void main(String[] args) {
		
		IProductBusiness pb = new ProductBusinessImpl();
		try {
		//	pb.add(1, "a", 1, 2);
			//pb.add(2, "b", 2, 5);
			pb.modify(1, "d", 1, 3, 9);
			pb.changePrice(2, 10);
			System.out.println("price:" + pb.getPriceByProduct(1));
			pb.getProduct(2);
			pb.getAmountByProduct(2);
			pb.getTotalAmountByCategory(2);
			System.out.println(pb.checkProductInCategory(1, 2));
			pb.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
