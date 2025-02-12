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

@Override
public String toString() {
	return "Drink [drinkSize=" + drinkSize + ", total price of the drinks =" + calculateTotal() + "]";
}//to string 

public char getDrinkSize() {
	return drinkSize;
}//getDrinkSize()

public void setDrinkSize(char drinkSize) {
	this.drinkSize = drinkSize;
}//setDrinkSize(char drinkSize)



	
	
 	
	
	
	
	
}//class Drink
