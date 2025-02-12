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



public String toString() {
	return "OrderItem [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
}//to string
public String getItemName() {
	return itemName;
}//getItemName
public void setItemName(String itemName) {
	this.itemName = itemName;
}//setItemName
public double getPrice() {
	return price;
}//getPrice()
public void setPrice(double price) {
	this.price = price;
}//setPrice(double price)
public int getQuantity() {
	return quantity;
}//getQuantity()
public void setQuantity(int quantity) {
	this.quantity = quantity;
}//setQuantity(int quantity)












	
	
}//class OrderItem
