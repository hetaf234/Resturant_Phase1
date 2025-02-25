package project_java;

import java.util.*;
public  class Order {
private int orderID;

private int numOfOrderItem;
private   static OrderItem OrderItemList[];
Scanner read= new Scanner (System.in);
public Order(int orderID, int size) {
	this.orderID = orderID;
	numOfOrderItem = 0;
	OrderItemList=new OrderItem [size];
}//end of Order constructor 

 public  boolean addOrderItem(OrderItem item) {
	if (numOfOrderItem>= OrderItemList.length)
		return false;
	OrderItemList[numOfOrderItem++]=item;
	return true;
}//addOrderItem(OrderItem item)

/*public boolean removeOrderItem (int itemId) {
	if (this.orderID != itemId) {
		System.out.println("Sorry! Could not find item with ID \" + itemId + \" in the order.");
	return false;// Item not found
}
	for (int i = 0; i < numOfOrderItem; i++) {
        if (OrderItemList[i] != null && OrderItemList[i].getItemId() == itemId) {
            // Shift elements to the left
            for (int j = i; j < numOfOrderItem - 1; j++) {
                OrderItemList[j] = OrderItemList[j + 1];
            }
            OrderItemList[numOfOrderItem - 1] = null; // Clear last slot
            numOfOrderItem--; // Reduce count
            System.out.println("✅ The item with ID " + itemId + " has been removed from the order.");
            return true; // Item removed successfully
        }
    }
 

	 } //removeOrderItem (String itemName)
	*/
 public boolean removeOrderItem(int orderID, int itemID) { 
	 if (this.orderID != orderID) {
	 
		 System.out.println("Order ID not found.");
	 return false; } // Loop through the order items using a simple loop 
	 for (int i = 0; i < OrderItemList.length; i++) {
		 
		 if (OrderItemList[i] != null && OrderItemList[i].getItemId() == itemID) {       OrderItemList[i] = null; 
		 numOfOrderItem--;
		 
		 System.out.println("Item with ID " + itemID + " has been removed from Order ID: " + orderID); 
		 return true; 
		 
		 } 
		 }
	 System.out.println("Item with ID " + itemID + " not found in the order."); 
		 return false; 
		 }  
		 
	  
public static  boolean searchOrderItem( int itemId ) {
	
	  for( int i= 0 ; i <OrderItemList.length ;i++) {
		 if (OrderItemList[i]!=null &&OrderItemList[i].getItemId()==itemId) {
	System.out.println("The item has been ordered before ");
	return true;
		 }//end of if statement 		 
		
	  }//end of the for loop 
	
	  System.out.println("The item has not been ordered before ");
	  return false ;

	  
}//searchOrderItem( String itemName )


public String toString() {
	String str=" orderID=" + orderID + "\n  numOfOrderItem= " + numOfOrderItem ;
	for(int i =0 ; i <numOfOrderItem;i++) {
	str+= "\n " +OrderItemList[i].toString();
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


public static void menu() {
	System.out.println(" MENU ");
	System.out.println("=======================================");
	System.out.println(" SANDWICHES:");
	System.out.println(" 1. Chicken Sandwich | 16.00 SAR");
	System.out.println(" 2. Meat Sandwich | 18.00 SAR");
	System.out.println(" * Extra meat Slice | +5.00 SAR ");
	System.out.println(" * Extra chicken Slice | +3.00 SAR ");
	System.out.println("---------------------------------------");
	System.out.println(" BEVERAGES:");
	System.out.println(" 3. Small Drink | 2.00 SAR");
	System.out.println(" 4. Medium Drink | 3.00 SAR");
	System.out.println(" 5. Large Drink | 4.00 SAR");
	System.out.println("=======================================");
}//menu 
public int getOrderItemList () {
	return OrderItemList.length ;
}

public void creatingOrder(int numOfOrderItem ) {
	for (int i=0; i<numOfOrderItem; i++) {
		System.out.println("Select an order item from 1 to 5 ");
	int choice2=read.nextInt();
	switch (choice2) {

	case 1: //chicken sandwich 
		System.out.println("How many slices would you like ? 3 SAR extra, enter 0 for none ");
		int slice= read.nextInt();
		OrderItem item1 = new ChickenSandwich (slice );
		if (addOrderItem(item1)) 
			System.out.println("**Chicken sandwich is successfully added to the order**");
		else  
			System.out.println("failed to add ");
		break;
		
	case 2: //Meat sandwich 
		System.out.println("How many slices would you like ? 5 SAR extra, enter 0 for none ");
		 slice= read.nextInt();
		OrderItem item2 = new MeatSandwich (slice );
		if (addOrderItem(item2)) 
			System.out.println("**Meat sandwich is successfully added to the order**");
		else  
			System.out.println("failed to add ");
		break;
		
	case 3: // Small drink 
		OrderItem item3 = new Drink ('s');
		if (addOrderItem(item3)) 
			System.out.println("**Drink is successfully added to the order**");
		else  
			System.out.println("failed to add ");
		break;
	case 4: //meduim drink 
		OrderItem item4 = new Drink ('m');
		if (addOrderItem(item4)) 
			System.out.println("**Drink is successfully added to the order**");
		else  
			System.out.println("failed to add ");
		break;
		
	case 5: //large drink 
		OrderItem item5 = new Drink ('l');
		if (addOrderItem(item5)) 
			System.out.println("**Drink is successfully added to the order**");
		else  
			System.out.println("failed to add ");
		break;
		
		default: System.out.println("try again, invalid selection ");
		          i--;
		          break; 
	}//switch
	
	}//for loop 
}





public double getTotalPrice() {
	double total=0.0;
	for (int i=0 ; i<numOfOrderItem ; i++) {
		total+=OrderItemList[i].calculateTotal();
	}//for 
	return total ;
}//public double getTotalPrice()















/*public OrderItem[] getOrderItemList() {
	return OrderItemList;
}

public void setOrderItemList(OrderItem[] orderItemList) {
	OrderItemList = orderItemList;
}*/





}//class Order
