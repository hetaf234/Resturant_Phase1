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
	return "itemName=" + itemId ;
}//to string
public int getItemId() {
	return itemId;
	
}//getItemName
public void setItemName(int  itemId) {
	this.itemId = itemId;
}//setItemName














	
	
}//class OrderItem
