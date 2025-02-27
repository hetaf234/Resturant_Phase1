package project_java;

public  class Drink extends OrderItem {
private char drinkSize;
public int itemId;
public Drink(char drinkSize) {
	if (drinkSize=='S' || drinkSize =='s') 
		itemId=33;
	
	else if (drinkSize=='M' || drinkSize =='m') 
		itemId=44;
	
	else if (drinkSize=='L' || drinkSize =='l') 
		itemId=55;
	
	
	this.drinkSize = drinkSize;
}//end of Drink constructor 

public double calculateTotal() {
	
	double p=0;
	if (drinkSize=='S' || drinkSize =='s') {
		p=2;
	}
	else if (drinkSize=='M' || drinkSize =='m') {
		p=3;
	}
	else if (drinkSize=='L' || drinkSize =='l') {
	p=5;
	}
	return p;
	
}//end of calculateTotal()

@Override
public String toString() {
	return " Drink \n drink Size=" + drinkSize +"\n item id=  "+ itemId + "\n total price of the drinks =" + calculateTotal() + "SAR";
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
