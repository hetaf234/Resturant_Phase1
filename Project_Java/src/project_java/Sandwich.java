package project_java;

public abstract  class Sandwich extends OrderItem {


public Sandwich(String itemName, double price, int quantity) {
	super(itemName, price, quantity);
	
}//end of Sandwich constructor 


public abstract  double calculateTotal();

    
	
	
	
	
	
}//class sandwich
