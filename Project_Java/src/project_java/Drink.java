package project_java;

public  class Drink extends OrderItem {
private char drinkSize;
public int itemId;
public Drink(char drinkSize) {
	itemId=33;
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
	
	
	
	return p;
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

public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}



	
	
 	
	
	
	
	
}//class Drink
