package project_java;

public class Resturant {
public int numOfOrders;
Order orderList[];

public Resturant() {
	numOfOrders=0;
	orderList=new Order[100];
}//end of the consturctor 

public boolean addOrder(Order order) {
	 // Check if order with same ID exists
    for (int i = 0; i < numOfOrders; i++) {
        if (orderList[i] != null && orderList[i].getOrderID() == order.getOrderID()) {
            System.out.println("Order with ID " + order.getOrderID() + " already exists. Please enter a unique ID.");
            return false;
        }
    }

    // Add order if there's space
    if (numOfOrders < orderList.length) {
        orderList[numOfOrders] = new Order(order);
        numOfOrders++;
        System.out.println("Order ID " + order.getOrderID() + " has been successfully added.");
        return true;
    } else {
        System.out.println("Unable to add order. The restaurant has reached its order capacity.");
        return false;
    }
}


public boolean searchOrder(int orderID) {
	    for (int i = 0; i < numOfOrders; i++) { // Only search within valid orders
        if (orderList[i].getOrderID() == orderID) {
        	//System.out.println("the order is already exist . ");
            return true; // Order found
        }
    }//for loop 
 //System.out.println("sorry we could not find the order ");
    return false; //Order not found
}


public boolean removeOrder(int orderID) {
	 boolean orderFound = false;
	    
	    for (int i = 0; i < numOfOrders; i++) {
	        if (orderList[i] != null && orderList[i].getOrderID() == orderID) {
	            orderFound = true;
	            
	            // second loop in order to shift elements
	            for (int j = i; j < numOfOrders - 1; j++) {
	                orderList[j] = orderList[j + 1];
	            }
	            orderList[numOfOrders - 1] = null; // Clear last slot
	            numOfOrders--; // Reduce order count
	            
	            System.out.println("Order ID " + orderID + " removed successfully.");
	            return true;
	        }
	    }
	    
	    if (!orderFound) {
	        System.out.println("Order ID not found.");
	    }
	    return false;
}
	

public void removeOrderItem(int orderID, int itemID)
{   boolean orderFound = false;
    boolean itemRemoved = false;

    for (int i = 0; i < numOfOrders; i++) {
     if (orderList[i] != null && orderList[i].getOrderID() == orderID) {
        orderFound = true;
        
        if (orderList[i].removeOrderItem(orderID, itemID)) { 
            itemRemoved = true;
            System.out.println("Item with ID " + itemID + " removed from Order ID: " + orderID);
        }
        break; // Order found, no need to continue looping
    }
}

if (!orderFound) {
    System.out.println("Order ID not found.");
} else if (!itemRemoved) {
    System.out.println("Item ID " + itemID + " not found in Order ID: " + orderID);
}
}

@Override
public String toString() {
	 String str = "\n==============================\n";
	    str += " Number of Orders: " + numOfOrders + "\n";
	    str += "==============================\n";

	    for (int i = 0; i < numOfOrders; i++) {
	        if (orderList[i] != null) {
	            str += orderList[i].toString();
	        }
	    }

	    return str;
	
}// toString 





}//class Restaurant 
