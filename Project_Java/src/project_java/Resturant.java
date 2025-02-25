package project_java;

import java.util.Arrays;

public class Resturant {
private String 	ResturantName; 
private int numOfOrders;
Order orderList[];
public Resturant(String resturantName) {

	ResturantName = resturantName;
	numOfOrders=0;
	orderList=new Order[10];
	
}//end of the consturctor 

public boolean addOrder(Order order) {
    if (numOfOrders < orderList.length) { // Check if there's space
        orderList[numOfOrders] = order;
        numOfOrders++;
        return true;} 
    else 
    	return false ; 
    }// end of addOrder 

public boolean searchOrder(int orderID) {
    for (int i = 0; i < numOfOrders; i++) { // Only search within valid orders
        if (orderList[i].getOrderID() == orderID) {
            return true; // Order found
        }
    }
    return false; //Order not found
}
public boolean removeOrder(int orderID) {
    for (int i = 0; i < numOfOrders; i++) {
        if (orderList[i].getOrderID() == orderID)// found 
        {
            for (int j = i; j < numOfOrders - 1; j++) {
                orderList[j] = orderList[j + 1]; // Shift orders left
            }// end of foor loop 
            orderList[numOfOrders - 1] = null; // Clear last order
            numOfOrders--; // Reduce order count
            return true; //  Order removed successfully
        }// end of if statment 
    }// end of for loop 
    return false; //  Order not found
}// end of removeOrder 

@Override
public String toString() {
	String str= " Resturant Name=" + ResturantName + ", numOfOrders=" + numOfOrders + ", orderList=";
	for (int i=0 ; i<numOfOrders ; i++)
		str+= orderList[i].toString()+"/n ";
	
	return str;
	
}// toString 





}//class Resturant 
