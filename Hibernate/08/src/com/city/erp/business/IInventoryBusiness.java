package com.city.erp.business;

import java.util.List;

import com.city.erp.value.ProductValue;
import com.city.erp.value.WarehouseValue;

public interface IInventoryBusiness {
	public void add(String pid, int wno, int qty) throws Exception;
	public List<WarehouseValue> getWarehouseListByProduct(String pid) throws Exception;
	public List<ProductValue> getProductListWithoutWarehouse() throws Exception;
	public double getProductTotalAmount() throws Exception;
	public double getTotalAmountInWarehouse(int wno) throws Exception;
	public List<WarehouseValue> getWarehouseListWithoutProduct() throws Exception;
	public double getTotalAmountByProduct(String pid) throws Exception;
	public int getProductQTY(int pid) throws Exception;
}
