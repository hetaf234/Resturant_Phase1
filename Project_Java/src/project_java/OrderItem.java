package project_java;

public abstract class OrderItem {
protected  String itemName;//the name of the item
protected double price ;//the price 	
protected int quantity;// the quantity 
//attributes are done 
public OrderItem(String itemName, double price, int quantity) {

	this.itemName = itemName;
	this.price = price;
	this.quantity = quantity;
}//end of OrderItem Constructor 
public abstract double calculateTotal();

	
	
}//class OrderItem
