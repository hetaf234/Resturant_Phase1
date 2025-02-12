package project_java;

public class Order {
private int orderID;
private String casherName;
private int numOfOrderItem;
private OrderItem OrderItemList[];
public Order(int orderID, String casherName, int size) {
	this.orderID = orderID;
	this.casherName = casherName;
	numOfOrderItem = 0;
	OrderItemList=new OrderItem [size];
}//end of Order constructor 

public boolean addOrderItem(OrderItem item) {
	if (numOfOrderItem>= OrderItemList.length)
		return false;
	OrderItemList[numOfOrderItem++]=item;
	return true;
}//addOrderItem(OrderItem item)





}//class Order
