package project_java;

public abstract  class Sandwich extends OrderItem {



public abstract  double calculateTotal();


@Override
public String toString() {
	return "Sandwich [itemName=" + itemId + ", price="  + ", quantity="  + ", total price of sandwiches="
			+ calculateTotal() + "]";
}//to string 

    
	
	
	
	
	
}//class sandwich
