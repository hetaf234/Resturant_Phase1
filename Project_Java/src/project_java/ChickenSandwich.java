package project_java;

public class ChickenSandwich extends Sandwich {
	private int numOfSlices;
	public int itemId;
	
	public ChickenSandwich() {
		super();
		numOfSlices =0;
		itemId =11;
	}

	public ChickenSandwich( int numOfSlices) {
		itemId=11;
		this.numOfSlices = numOfSlices;
	}//end of ChickenSandwich constructor 

	@Override
	public double calculateTotal() {
		return 16 +(numOfSlices *3);
	}// calculateTotal()

	@Override
	public String toString() {
		return "ChickenSandwich [numOfSlices=" + numOfSlices + "/n itemName=" + itemId + "/n price=" 
				+ "/n quantity=" +  "/n total price of chicken sandwiches =" + calculateTotal() + "]";
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
