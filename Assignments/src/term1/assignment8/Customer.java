package term1.assignment8;

//Imports
import java.util.ArrayList;

public class Customer{
	
	//Fields
	private String name;
	private ArrayList<Product> shoppingBasket;
	private ArrayList<Product> ownedProducts;
	private ArrayList<GoldCoin> purse;
	
	/**
	 * This Constructor takes 1 arguments - String
	 * This sting sets the name of the customer
	 * All other fields are initialised
	 */
	public Customer(String name){
		
		//Initialise Variables
		this.name = name;	
		purse = new ArrayList<GoldCoin>();
		shoppingBasket = new ArrayList<Product>();
		ownedProducts = new ArrayList<Product>();
		
	}
	
	//Methods
	
	/**
	 * This method takes 1 argument - Product
	 * this product is added to the shopping basket array
	 */
	public void addToShoppingBasket(Product product){
		shoppingBasket.add(product);
	}
	
	/**
	 * This method takes 1 argument - Product
	 * All items int he shopping basket are looped over and check if the supplied product matches
	 * If it does, it is removed and returns true
	 * If it does not, false is returned
	 */
	public boolean removeFromShoppingBasket(Product product){
		//Loop over the basket
		for(int i = 0; i < shoppingBasket.size(); i++){
			//If the product is found...
			if(product.equals(shoppingBasket.get(i))){
				//...Remove the product
				shoppingBasket.remove(i);
				return true;
			}
		}
		//If it makes it here, return false as product is not there
		return false;
	}
	
	/**
	 * This method takes 1 argument - String
	 * If this string matches any product name in the basket,
	 * That product is returned.
	 * Otherwise, it returns null
	 */
	public Product searchShoppingBasket(String productName){
		//Loop over the basket
		for(int i = 0; i < shoppingBasket.size(); i++){
			//If a product exists with that name...
			if(productName.equals(shoppingBasket.get(i).name())){
				//...Return that product
				return shoppingBasket.get(i);
			}
		}
		//If they make it here, no product like that in basket
		return null;
	}
	
	/**
	 * This method takes 1 argument - Product
	 * This product gets added to the ownedProducts array
	 */
	public void addOwnedProduct(Product product){
		//Appends the product to the array list
		ownedProducts.add(product);
	}
	
	/**
	 * This method takes 1 argument - Gold Coin
	 * This coin is added to the array list of purse
	 */
	public void addCoin(GoldCoin coin){
		//Append the GoldCoin to the purse
		purse.add(coin);
	}
	
	/** 
	 * This method takes 0 arguments
	 * It returns the field name
	 */
	public String name(){
		return name;
	}
	
	/**
	 * This method takes 1 argument - Shop
	 * It calculates the price of the items in the basket,
	 * If this value is greater than the number of coins,
	 * Then false is returned.
	 * Otherwise, all the items are purchased from the basket and moved to the owned array
	 * All coins are transferred to the supplied shop
	 * If transaction was successful, true is returned and basket is reset.
	 */
	public boolean purchaseProducts(Shop shop){
		//Temp Variable to hold the cost of the shopping basket
		int shoppingBasketCost = 0;
		
		//Temp Variable to hold the gold coin
		GoldCoin tempCoin;
		
		//Calculates the cost of the basket
		for(Product item : shoppingBasket){
			shoppingBasketCost = shoppingBasketCost + item.price();
		}
		
		//Checks to see if the customer can afford the basket
		if(shoppingBasketCost > purse.size()){
			return false; //Transaction was unsuccessful
		}
		
		//Loops for the value in shoppingBasketCost
		for(int i = 0; i < shoppingBasketCost; i++){
			//Gets the coin
			tempCoin = purse.get(purse.size() -1); //Gets the last element
			purse.remove(purse.size() - 1); //Removes the last coin from the array
			shop.addGoldCoin(tempCoin); //Gives this coin to the shop			
		}
		
		//For each product in the basket, append this to their owned array
		for(Product product : shoppingBasket){
			ownedProducts.add(product);
		}
		
		//Empties their basket
		shoppingBasket.clear();
		
		//Overall spend in the shop's array is updated
		shop.updateTotalSpend(this, shoppingBasketCost);
		
		return true; //Transaction was successful
		
	}
	
	/**
	 * This method is to override the toSting() method in object
	 * It returns details about this object
	 */
	public String toString(){
		//Create a base String
		String baseString = "Customer: ['name' = " + name + ", 'purse' = " + purse.size() + ", 'shoppingBasket' =";
		
		//Loops over the items in the shopping basket
		for(Product item : shoppingBasket){
			baseString = baseString + " ['name' = " + item.name() + "'price' = " + item.price() + "]";
		}
		
		//Used for formatting
		if(shoppingBasket.size() == 0){
			baseString = baseString + " [";
		}	
		
		baseString = baseString + "], 'ownedProducts' =";
		
		//Loops over owned items
		for(Product item : ownedProducts){
			baseString = baseString + " ['name' = " + item.name() + "'price' = " + item.price() + "]]";
		} 
		//Used for formatting
		if( ownedProducts.size() == 0) {
			baseString = baseString + " []]";
		}
		
		//Returns details about customer
		return baseString;	
		
	}
	
	/**
	 * This method takes 0 arguments
	 * It will return all the products in the shopping basket in a form of a string
	 */
	public String basket(){
		//Base String
		String baseString = "In your basket you have:";
		
		for(Product item : shoppingBasket){
			baseString = baseString + " ['name' = " + item.name() + ", 'price' = " + item.price() +"]";
		}
		
		if(shoppingBasket.size() == 0){
			baseString = baseString + " []";
		}
		
		return baseString;
	}
	
	/**
	 * This method takes 0 arguments
	 * It will return all the products the customer owns in the form a string
	 */
	public String owned(){
		//Base String
		String baseString = "You own:";
		
		for(Product item : ownedProducts){
			baseString = baseString + " ['name' = " + item.name() + ", 'price' = " + item.price() +"]";
		}
		
		if(ownedProducts.size() == 0){
			baseString = baseString + " []";
		}
		
		return baseString;
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns the number of coins in the purse
	 */
	public int purse(){
		
		return purse.size();		
	}
	
	
}