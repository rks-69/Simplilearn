package org.simplilearn.training;

public class Product {
	private String ProductID;
	private String ProductName;
	private String ProductCost;
	private String ProductQuantity;
	public Product(String productID, String productName, String productCost, String productQuantity) {
		super();
		ProductID = productID;
		ProductName = productName;
		ProductCost = productCost;
		ProductQuantity = productQuantity;
	}
	public String getProductID() {
		return ProductID;
	}
	public void setProductID(String productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCost() {
		return ProductCost;
	}
	public void setProductCost(String productCost) {
		ProductCost = productCost;
	}
	public String getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		ProductQuantity = productQuantity;
	}
	
}
