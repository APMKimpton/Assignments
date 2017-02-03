package year1.term1.assignment8;

public class Product{
	
	//Fields
	private String name;
	private int price;
	
	/**
	 * This is the Constructor.
	 * It takes 2 arguments, one for the name of the product and the other for the price
	 * It uses these arguments to initialise the variables
	 */
	public Product(String name, int price){
		
		//Initialise Variables
		this.name = name;
		this.price = price;
		
	}
	
	
	/**
	 * This method is to override the toSting() method in object
	 * It returns details about this object
	 */
	public String toString(){
		return ("Product: ['name' = " + name + ", 'price' = " + price + "]");
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns the name field
	 */
	public String name(){
		return name;
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns the price field
	 */
	public int price(){
		return price;
	}
}