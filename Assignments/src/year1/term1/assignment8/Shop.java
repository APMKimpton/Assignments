package year1.term1.assignment8;

//Imports
import java.util.ArrayList;
import java.util.TreeMap;

public class Shop{
	
	//Fields
	private String name;
	private ArrayList<Product> products;
	private ArrayList<GoldCoin> coinBox;
	private TreeMap<String, Integer> customerTotalSpend;
	
	/**
	 * This constructor takes 1 argument
	 * The argument is the name of the shop,
	 * All other fields are initialised
	 */
	public Shop(String name){
		
		//Initialise Variables
		this.name = name;
		products = new ArrayList<Product>();
		coinBox = new ArrayList<GoldCoin>();
		customerTotalSpend = new TreeMap<String, Integer>();
		
	}
	
	//Methods
	
	/**
	 * This method takes 1 argument
	 * This argument is a product and is added to the products array
	 */
	public void addProduct(Product product){
		//Append the Product to the array list
		products.add(product);
	}
	
	/**
	 * This method takes 1 argument
	 * If the product exits, it removes the product and returns true
	 * If the product doesn't exit, false is returned.
	 */
	public boolean removeProduct(Product product){
		
		//Loop over the array list
		for(int i = 0; i < products.size(); i++){
			//If the product is found
			if(product.equals(products.get(i))){
				//Remove the item
				products.remove(i);
				return true;
			}		
		}
		
		//If the program gets here, the item could not be removed
		return false; 
	}
	
	/**
	 * Thus method takes 1 argument
	 * This argument is a string
	 * If this sting matches a product name in the shop,
	 * the product is returned, otherwise null is
	 */
	public Product searchProduct(String productName){
		
		//Loop over the array list
		for(int i = 0; i < products.size(); i++){
			if(productName.equals(products.get(i).name())){
				return products.get(i); //returns the product
			}
		}
		
		//If they get here, that product isn't in the array list
		return null;
	}
	
	/**
	 * This method takes 1 argument - a GoldCoin
	 * This coin is added to the coinBox array
	 */
	public void addGoldCoin(GoldCoin coin){
		//Adds a coin to the coinBoxArray
		coinBox.add(coin);
	}
	
	/**
	 * This method takes 2 arguments - a Customer and a int
	 * If the customer already exists in the treemap (used as a key),
	 * Then the new amount is added on to the old amount (the int).
	 * Otherwise, if the customer isn't in the array, he is added and set this value passed
	 */
	public void updateTotalSpend(Customer customer, int amount){
		//Check if customer is already  in the array
		if(customerTotalSpend.containsKey(customer.name())){
			//Updates their value by incrementing by value
			customerTotalSpend.put(customer.name(), customerTotalSpend.get(customer.name()) + amount);
		} else {
			//Creates a new customer and sets their expenditure to amount
			customerTotalSpend.put(customer.name(), amount);
		}
	}
	
	/**
	 * This method is to override the toSting() method in object
	 * It returns details about this object
	 */
	public String toString(){
		
		//Temp Variable for the returned string
		String baseString;
		baseString = "Shop: ['name' = " + name + "]" + " ['products' =";
		
		//For each loop
		for(Product item : products){
			//Append each product to the base String
			baseString = baseString + " ['name' = " + item.name() + ", 'price' = " + item.price() + "]";
		}
		
		if(products.size() == 0){
			baseString = baseString + " []";
		}
		
		baseString = baseString + "]";
		
		return baseString;
		
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns the number of coins in the shops coin box
	 */
	public int coinBox(){
		return coinBox.size();
	}
	
}