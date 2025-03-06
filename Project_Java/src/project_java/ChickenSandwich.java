package project_java;

public class ChickenSandwich extends Sandwich {
	private int numOfSlices;
	

	public ChickenSandwich( int numOfSlices) {
		super(11);
		this.numOfSlices = numOfSlices;
	}//end of ChickenSandwich constructor 
	
	public ChickenSandwich(ChickenSandwich ch) {
		super(ch.itemId);
		this.numOfSlices = ch.numOfSlices;
	}
	
	@Override
	public double calculateTotal() {
		return 16 +(numOfSlices *3);
	}// calculateTotal()

	@Override
	public String toString() {
		return "ChickenSandwich \n number of Slices= " + numOfSlices + "\n item id =" + itemId +
				"\n total price of chicken sandwiches =" + calculateTotal() + "SAR";
	}//to string 

	public int getNumOfSlices() {
		return numOfSlices;
	}//getNumOfSlices()

	public void setNumOfSlices(int numOfSlices) {
		this.numOfSlices = numOfSlices;
	}//setNumOfSlices(int numOfSlices)

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	
	

	
	
}//class chickenSandwich
