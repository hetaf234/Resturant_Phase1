package project_java;
import java.util.*;
public class ResturantTest {
	 static Scanner read =  new Scanner ( System. in );	
	  public static void main(String[] args) {
		  
	Resturant res= new Resturant();
	Order ord1=new Order (1111, 1);
	Order ord2=new Order (2222, 2);
	Order ord3=new Order (3333, 3);
	Order ord4=new Order (4444, 4);
	OrderItem chicken= new ChickenSandwich();
	System.out.println("----------------WELCOME TO OUR RESTURANT --------------");
	int choice =0;
	int id;
		do { 
		
			System.out.println("Choose one of the choices: ");
			System.out.println("1.Create a new order. ");
			System.out.println("2.Remove an item in the order.");
			System.out.println("3.Search for an order ");
			System.out.println("4.Cancel an order.");
			System.out.println("5.Exit");
			choice = read.nextInt();
			//System.out.println("Enter the order ID");
			/*int id=read.nextInt();
			if (  res.searchOrder(id) ) 
				System.out.println("The id is not valid , please try again.");
				*/
			switch(choice) {
			
			case 1: 
				
				/*
				 System.out.println("Enter the order ID");
				
				int id=read.nextInt();
				
				if (  res.searchOrder(id) ) 
					System.out.println("The id is not valid , please try again.");
			
				else 
				{
				 */
					//System.out.println("How many items would you like to add to your order?");
					//int numofItems=read.nextInt();
					System.out.println("What would you like to order? ");
					ord1.menu();
					
					for (int i=0; i<ord1.getOrderItemList(); i++) {
						System.out.println("Select an order item from 1 to 5 ");
					int choice2=read.nextInt();
					switch (choice2) {
	
					case 1: //chicken sandwich 
						System.out.println("How many slices would you like ? 3 SAR extra, enter 0 for none ");
						int slice= read.nextInt();
						((ChickenSandwich)(chicken)). setNumOfSlices (slice);
						if (ord1.addOrderItem(chicken)) 
							System.out.println("**Chicken sandwich is successfully added to the order**");
						else  
							System.out.println("failed to add ");
						break;
						
					case 2: //Meat sandwich 
						System.out.println("How many slices would you like ? 5 SAR extra, enter 0 for none ");
						 slice= read.nextInt();
						OrderItem item2 = new MeatSandwich (slice );
						if (ord1.addOrderItem(item2)) 
							System.out.println("**Meat sandwich is successfully added to the order**");
						else  
							System.out.println("failed to add ");
						break;
						
					case 3: // Small drink 
						OrderItem item3 = new Drink ('s');
						if (ord1.addOrderItem(item3)) 
							System.out.println("**Drink is successfully added to the order**");
						else  
							System.out.println("failed to add ");
						break;
					case 4: //meduim drink 
						OrderItem item4 = new Drink ('m');
						if (ord1.addOrderItem(item4)) 
							System.out.println("**Drink is successfully added to the order**");
						else  
							System.out.println("failed to add ");
						break;
						
					case 5: //large drink 
						OrderItem item5 = new Drink ('l');
						if (ord1.addOrderItem(item5)) 
							System.out.println("**Drink is successfully added to the order**");
						else  
							System.out.println("failed to add ");
						break;
						
						default: System.out.println("try again, invalid selection ");
						          i--;
						          break; 
					}//switch
					
					}//for loop 
			//{ else 
			res.addOrder(ord1);
				 break;
				 
			case 2:   //Remove an item in the order.
				System.out.print("Enter the order ID: ");
				  int removeOrderID = read.nextInt();
					System.out.print("Enter the item IDbto remove: ");
					  int removeItemID = read.nextInt();
                         res.removeOrderItem(removeOrderID, removeItemID);


			/*
				System.out.print("Enter the order ID: ");
			    int orderID = read.nextInt();
			    if( res.searchOrder(orderID) ==false )
			    	System.out.println("sorry ");
			    else 
			    {
			    
			        System.out.print("Enter the item ID to remove: ");
			        int itemId = read.nextInt();
			        if (res.removeOrderItem(orderID,itemId)) {
			        	
			            System.out.println("✅ Item with ID " + itemId + " removed successfully.");
			        } else {
			            System.out.println("❌ Item not found in the order.");
			        }
			    }
			*/
			    //else 
				
				 break;
			case 3: 
				   System.out.print("Enter Order id you want to remove: ");
			        
			        int removeEntireOrderID= read.nextInt();
			        res.removeOrder(removeEntireOrderID);
			        
				 break;
				 
				 
				 
			case 4://cancel an order
				System.out.println(" please enter an order ID to cancel ");
				 id = read.nextInt();
				 res.removeOrder(id);
			
				 break;
			case 5: 
				 System.out.println(res.toString()); 
				 System.out.println("---------");
				 System.out.println(ord1.toString());
				 break;
			case 6:
				System.out.println("enter an item ID to look for ");
				 id=read.nextInt();
				if (ord1.searchOrderItem(id))
					System.out.println("found ");
				else 
					System.out.println("sorry ");
				 break;
			case 7:

				System.exit(0);
			}// switch
			
			
			
			
			
		}while (choice!=10);
		
		
		
		
		
		
	}//ResturantTest Main End

}//class ResturantTest
