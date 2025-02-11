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
}
 







}//class meatSandwich
