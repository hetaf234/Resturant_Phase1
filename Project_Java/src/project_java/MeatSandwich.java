package project_java;

public  class MeatSandwich extends Sandwich {
 private int numOfSlices;

public MeatSandwich(String itemName, double price, int quantity, int numOfSlices) {
	super(itemName, price, quantity);
	this.numOfSlices=numOfSlices;
}//end of MeatSandwich constuctor 



@Override
public double calculateTotal() {
	return ( (price* quantity )+(numOfSlices *5));	
}//calculateTotal()



@Override
public String toString() {
	return "MeatSandwich [numOfSlices=" + numOfSlices + "/n itemName=" + itemName + "/n price=" + price + "/n quantity="
			+ quantity + "/n total price of meat sandwiches =" + calculateTotal() + "]";
}//to string 



public int getNumOfSlices() {
	return numOfSlices;
}//getNumOfSlices()



public void setNumOfSlices(int numOfSlices) {
	this.numOfSlices = numOfSlices;
}//setNumOfSlices(int numOfSlices)
 







}//class meatSandwich
