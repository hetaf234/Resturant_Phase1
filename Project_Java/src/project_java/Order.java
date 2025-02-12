package project_java;


public class Order {
private int orderID;

private int numOfOrderItem;
private OrderItem OrderItemList[];
public Order(int orderID, int size) {
	this.orderID = orderID;

	numOfOrderItem = 0;
	OrderItemList=new OrderItem [size];
}//end of Order constructor 

public boolean addOrderItem(OrderItem item) {
	if (numOfOrderItem>= OrderItemList.length)
		return false;
	OrderItemList[numOfOrderItem++]=item;
	return true;
}//addOrderItem(OrderItem item)

public boolean removeOrderItem (String itemName) {
  for( int i= 0 ; i <numOfOrderItem ;i++) {
	 if (OrderItemList[i].getItemName().equalsIgnoreCase(itemName)) {
		 for (int j = i; j < numOfOrderItem - 1; j++) {
			 OrderItemList[j] = OrderItemList[j + 1]; // Shift items left
         }//end of inner for loop
		 
		 OrderItemList[numOfOrderItem - 1] = null; // Clear last item
		 numOfOrderItem--; // Reduce count
		 
		 
		 System.out.println("The"+itemName+"has been removed successfully! ");
         return true; //  Successfully removed
     }//end of if statement
 }//end of outer for loop  
  System.out.println("Sorry ! we could not find "+ itemName);
 return false; // Item not found

	 } //removeOrderItem (String itemName)
		 
	  
public boolean searchOrderItem( String itemName ) {
	
	  for( int i= 0 ; i <numOfOrderItem ;i++) {
		 if (OrderItemList[i].getItemName().equalsIgnoreCase(itemName)) {
	System.out.println("Great choice! /n your "+ itemName +"is available.");
	return true;
		 }//end of if statement 		 
		
	  }//end of the for loop 
	
	  System.out.println("Sorry! /n your "+ itemName +"is not available.");
	  return false ;

	  
}//searchOrderItem( String itemName )


public String toString() {
	String str="Order [orderID=" + orderID + ", numOfOrderItem=" + numOfOrderItem + "]";
	for(int i =0 ; i <numOfOrderItem;i++) {
	str+= "/n " +OrderItemList[i].toString();
	}//end for loop 
	return str;	
}//to string 

public int getOrderID() {
	return orderID;
}//getOrderID()

public void setOrderID(int orderID) {
	this.orderID = orderID;
}//setOrderID(int orderID)

public int getNumOfOrderItem() {
	return numOfOrderItem;
}//getNumOfOrderItem()

public void setNumOfOrderItem(int numOfOrderItem) {
	this.numOfOrderItem = numOfOrderItem;
}//setNumOfOrderItem(int numOfOrderItem)




/*public OrderItem[] getOrderItemList() {
	return OrderItemList;
}

public void setOrderItemList(OrderItem[] orderItemList) {
	OrderItemList = orderItemList;
}*/





}//class Order
