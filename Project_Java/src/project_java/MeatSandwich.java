package project_java;

public  class MeatSandwich extends Sandwich {
 private int numOfSlices;
public int itemId;
public MeatSandwich( int numOfSlices) {
	itemId=22;
	this.numOfSlices=numOfSlices;
}//end of MeatSandwich constuctor 



@Override
public double calculateTotal() {
	return (18+(numOfSlices *5));	
}//calculateTotal()



@Override
public String toString() {
	return "MeatSandwich [numOfSlices=" + numOfSlices + "/n itemName=" + itemId + "/n price="  + "/n quantity="
			 + "/n total price of meat sandwiches =" + calculateTotal() + "]";
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
 







}//class meatSandwich
