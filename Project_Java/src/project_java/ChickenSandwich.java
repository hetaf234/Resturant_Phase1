package project_java;

public class ChickenSandwich extends Sandwich {
	private int numOfSlices;

	public ChickenSandwich(String itemName, double price, int quantity, int numOfSlices) {
		super(itemName, price, quantity);
		this.numOfSlices = numOfSlices;
	}//end of ChickenSandwich constructor 

	@Override
	public double calculateTotal() {
		return ( (price* quantity )+(numOfSlices *3));
	}// calculateTotal()

	@Override
	public String toString() {
		return "ChickenSandwich [numOfSlices=" + numOfSlices + "/n itemName=" + itemName + "/n price=" + price
				+ "/n quantity=" + quantity + "/n total price of chicken sandwiches =" + calculateTotal() + "]";
	}//to string 

	public int getNumOfSlices() {
		return numOfSlices;
	}//getNumOfSlices()

	public void setNumOfSlices(int numOfSlices) {
		this.numOfSlices = numOfSlices;
	}//setNumOfSlices(int numOfSlices)
	
	
	

	
	
}//class chickenSandwich
