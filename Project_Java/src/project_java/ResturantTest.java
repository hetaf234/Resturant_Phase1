package project_java;
import java.util.*;
public class ResturantTest {
	 static Scanner read =  new Scanner ( System. in );	
	  public static void main(String[] args) {
		  
	Resturant res= new Resturant();
	
	System.out.println("----------------WELCOME TO OUR RESTURANT --------------");
	int choice =0;
	int id;
	
	do { 
			System.out.println("Choose one of the choices: ");
			System.out.println("1.Create a new order. ");
			System.out.println("2.Remove an item in the order.");
			System.out.println("3.Cancel an order.");
			System.out.println("4.Search for an order item ");
			System.out.println("5.Search for an order ");
	
			System.out.println("6.display orders ");
			System.out.println("7.Exit ");
			choice = read.nextInt();
			
			
			switch(choice) {
			case 1: 
				    System.out.println("Enter a unique Order ID: ");
				    System.out.println("(e.g., 1111, 2222, or any number of your choice)");
				    int orderId = read.nextInt(); 
				    
				    // Validate if Order ID is unique
				    while (res.searchOrder(orderId)) {
				        System.out.println("Order ID already exists. Please enter a different ID:");
				        orderId = read.nextInt();
				    }
				    
					System.out.println("How many items would you like to add to your order?  ");
					int numofItems=read.nextInt();
				    
					Order newOrder = new Order(orderId, numofItems);
					System.out.println("What would you like to order?");
					Order.menu();
					newOrder.creatingOrder(numofItems);
					
					System.out.println("─────────────────────────────────────");
				    System.out.println("Order ID " + orderId + " has been successfully created.");
				    System.out.println("Items added: " + numofItems);
				    System.out.println("Total Price: " + newOrder.getTotalPrice() + " SAR");
				    System.out.println("─────────────────────────────────────");
					
					res.addOrder(newOrder);
					break;
				 
			case 2:   //Remove an item in the order.
				System.out.println("Enter the order ID:  ");
				  int removeOrderID = read.nextInt();
					System.out.println("Enter the item ID to remove: ");
					System.out.println("11 chicken sandwich ");
					System.out.println("22 meat sandwich ");
					System.out.println("33 small drink  ");
					System.out.println("44 meduim drink  ");
					System.out.println("55 large drink  ");
					System.out.println("-----------------------------");
					  int removeItemID = read.nextInt();
                         res.removeOrderItem(removeOrderID, removeItemID);
				
				 break;
			case 3: //remove order 
				   System.out.println("Enter the Order ID to cancel an order: ");
			        int removeEntireOrderID= read.nextInt();
			        res.removeOrder(removeEntireOrderID);
			        
				 break;
				 
				 
				 
			case 4://search for an order item
				
				System.out.println("Enter the order ID: ");
			    int searchOrderId = read.nextInt();
			    
			    System.out.println("Enter the item ID to look for: ");
			    System.out.println("11 - Chicken Sandwich");
			    System.out.println("22 - Meat Sandwich");
			    System.out.println("33 - Small Drink");
			    System.out.println("44 - Medium Drink");
			    System.out.println("55 - Large Drink");
			    int searchItemId = read.nextInt();
			    
			    boolean orderFound = false; // Flag to check if order exists
			    
			    for (int i = 0; i < res.numOfOrders; i++) { // Iterate through stored orders
			        if (res.orderList[i] != null && res.orderList[i].getOrderID() == searchOrderId) {
			            orderFound = true;
			            if (res.orderList[i].searchOrderItem(searchItemId)) {
			                System.out.println("Item found in Order ID: " + searchOrderId);
			            } else {
			                System.out.println("Item not found in Order ID: " + searchOrderId);
			            }
			            break; // Exit loop after finding the order
			        }
			    }
			    
			    if (!orderFound) {
			        System.out.println("Order ID not found.");
			    }
			    break;
			
			case 5: 
			System.out.println("enter the order id to look for : ");
			 id=read.nextInt();
			 if (res.searchOrder(id)) {
				    System.out.println("Order with ID " + id + " exists.");
				} else {
				    System.out.println("Order with ID " + id + " not found.");
				}
				break;
			case 6: 
				 System.out.println(res.toString()); 
				 System.out.println("---------");
		
				 break;
			
			case 7:
				System.out.println("Exiting system... Thank you for using our restaurant management system.");
				System.exit(0);
			}// switch
			
			
			
			
			
		}while (choice!=7);
		
		
	}//ResturantTest Main End

}//class ResturantTest
