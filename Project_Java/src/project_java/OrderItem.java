package project_java;

public abstract class OrderItem {
protected  int itemId;//the name of the item


public OrderItem() {
	
}

public OrderItem(int id ) {
	itemId=id;
}

OrderItem(OrderItem item){
	itemId=item.itemId;
}


public abstract double calculateTotal();


public String toString() {
	 return " Item ID: " + itemId + "\n Price: " + calculateTotal() + " SAR";
}//to string
public int getItemId() {
	return itemId;
	
}//getItemName
public void setItemName(int  itemId) {
	this.itemId = itemId;
}//setItemName














	
	
}//class OrderItem
