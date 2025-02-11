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
	}
	
	
	
	
	
	
	
}//class chickenSandwich
