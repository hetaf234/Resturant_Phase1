package project_java;

public abstract class OrderItem {
protected  int itemId;//the name of the item
//protected double price ;//the price 	
//protected int quantity;// the quantity 
//attributes are done 


public abstract double calculateTotal();



public OrderItem() {
	super();
}



public String toString() {
	return "itemName=" + itemId ;
}//to string
public int getItemId() {
	return itemId;
	
}//getItemName
public void setItemName(int  itemId) {
	this.itemId = itemId;
}//setItemName














	
	
}//class OrderItem
