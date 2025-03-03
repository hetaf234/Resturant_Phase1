package project_java;


public class Resturant {
private int numOfOrders;
Order orderList[];
public Resturant() {
	numOfOrders=0;
	orderList=new Order[10];
	
}//end of the consturctor 

public boolean addOrder(Order order) {
    if (numOfOrders < orderList.length) { // Check if there's space
        orderList[numOfOrders] = new Order(order);
        numOfOrders++;
        checkId(order.getOrderID());
        
        System.out.println("order is added ** ");
        return true;} 
    
    else 
    	  System.out.println("order is NOT added ** ");
    	return false ; 
    }// end of addOrder 

/*public boolean isValidOrderID(int order) {
	
	 if ( order >= 1000 &&  order <= 9999) 
		 return true ;
	 else 
		 return false ; 
}//isValidOrderID(int orderID) */

public boolean searchOrder(int orderID) {
	    for (int i = 0; i < numOfOrders; i++) { // Only search within valid orders
        if (orderList[i].getOrderID() == orderID) {
        	System.out.println("the order is already exist . ");
            return true; // Order found
        }
    }//for loop 
 
    return false; //Order not found
}
public boolean removeOrder(int orderID) {
	if(checkId(orderID)) {
    for (int i = 0; i < numOfOrders; i++) {
        if (orderList[i].getOrderID() == orderID)// found 
        {
            for (int j = i; j < numOfOrders - 1; j++) {
                orderList[j] = orderList[j + 1]; // Shift orders left
            }// end of foor loop 
            orderList[numOfOrders - 1] = null; // Clear last order
            numOfOrders--; // Reduce order count
            System.out.println("the order is canceled successfully");
            return true; //  Order removed successfully
        }// end of if statment 
    }// end of for loop 
	}//if(checkId(orderID))
	
    System.out.println("the order is not found ");
    return false; //  Order not found
}// end of removeOrder 

public void removeOrderItem(int orderID, int itemID)
{
	for (int i = 0; i < numOfOrders ; i++) 
	
	if (orderList[i] != null && orderList[i].getOrderID() == orderID)

		orderList[i].removeOrderItem(orderID, itemID);// Remove using itemID return; } } System.out.println("Order ID not found."); }
}//method 

@Override
public String toString() {
	String str=  " numOfOrders=" + numOfOrders + ", orderList=";
	for (int i=0 ; i<numOfOrders ; i++)
		str+= orderList[i].toString()+"\n ";
	
	return str;
	
}// toString 

public boolean checkId(int OrderId) {
	if (OrderId==1111 ||OrderId==2222||OrderId==3333||OrderId==4444 ) 
		return true ;
		
			

	System.out.println("the Id is not valid ");
	return false;
}//checkId(int OrderId)


}//class Resturant 
