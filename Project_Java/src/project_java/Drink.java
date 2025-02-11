package project_java;

public  class Drink extends OrderItem {
private char drinkSize;

public Drink(String itemName, double price, int quantity, char drinkSize) {
	super(itemName, price, quantity);
	this.drinkSize = drinkSize;
}//end of Drink constructor 

public double calculateTotal() {
	
	double p=0;
	if (drinkSize=='S' || drinkSize =='s') {
		p=5;
	}
	else if (drinkSize=='M' || drinkSize =='m') {
		p=10;
	}
	else if (drinkSize=='L' || drinkSize =='l') {
	p=15;
	}
	
	
	
	return p*quantity ;
}//end of calculateTotal()


	
	
 	
	
	
	
	
}//class Drink
