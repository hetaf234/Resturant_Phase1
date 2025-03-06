package project_java;

public abstract  class Sandwich extends OrderItem {
Sandwich(){
	
}

Sandwich(int id){
	super(id);
}

public abstract  double calculateTotal();


@Override
public String toString() {
	return " item id = " + itemId   + " \n total price of sandwiches="
			+ calculateTotal() ;
}//to string 

  
}//class sandwich
