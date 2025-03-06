package project_java;

public  class Drink extends OrderItem {
private char drinkSize;

public Drink(char drinkSize) {
	super (getDrinkItemId(drinkSize));
	
	
	this.drinkSize = drinkSize;
}//end of Drink constructor 

public Drink(Drink D) {
   itemId=D.itemId;
   drinkSize = D.drinkSize;
}

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

public static int getDrinkItemId(char size) {
    if (size == 'S' || size == 's') return 33;
    if (size == 'M' || size == 'm') return 44;
    if (size == 'L' || size == 'l') return 55;
    return -1; // Invalid size
}


	
	
 	
	
	
	
	
}//class Drink
