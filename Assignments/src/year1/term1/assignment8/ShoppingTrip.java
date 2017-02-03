package year1.term1.assignment8;

//Imports
import java.util.Scanner;

public class ShoppingTrip{
	
	/**
	 * This is the main method which is run from the terminal
	 */
	public static void main(String[] args){
		
		//Create 3 products
		Product productDiamond = new Product("Diamond" , 40);
		Product productCrownJewels = new Product("Crown Jewels", 100);
		Product productSilverLocket = new Product("Silver Locket", 60);
		
		//Print the details of each product out
		System.out.println(productDiamond);
		System.out.println(productCrownJewels);
		System.out.println(productSilverLocket);	
		
		//Create a shop
		Shop shop = new Shop("Hidden Hideaway");
		
		//Add products to the shop
		shop.addProduct(productDiamond);
		shop.addProduct(productCrownJewels);
		shop.addProduct(productSilverLocket);
		
		//Adds 125 coins to the shop's coin box
		for(int i = 0; i < 125; i++){
			//Add this coin to the array
			shop.addGoldCoin(new GoldCoin());
		}
		
		//Print the shop details
		System.out.println(shop);
		System.out.println("The shop has " + shop.coinBox() + " gold coins.");
		
		//Create a customer
		Customer customer = new Customer("Black Beard");
		
		//Adds 100 coins to the customer
		for(int i = 0; i < 100; i++){
			customer.addCoin(new GoldCoin());
		}
		
		//Print Customer Details
		System.out.println(customer);
		
		//#######################################################################\\
		//#######################################################################\\
		
		//Introduction Message
		System.out.println("Welcome to my shop!");
		
		//Initialise a scanner object
		Scanner in = new Scanner(System.in);
		
		//While loop for the purchasing of the items
		while(true){			
			//Print details to the user
			System.out.println(""); //used as a blank space
			System.out.println("Details about the shop:");
			System.out.println(shop);
			System.out.println("The shop has " + shop.coinBox() + " gold coins.");
			System.out.println(""); //used as a blank space
			System.out.println(customer.basket());
			System.out.println(customer.owned());
			System.out.println("You have " + customer.purse() + " gold coins.");
			
			//Ask for user input
			String input = in.nextLine();
			System.out.println(""); //used as a blank space
			
			if(input.equals("exit")){
				//Break the while loop - user wants to quit
				break;
			} else if (input.equals("add product")){
				
				//Ask for the product name they would like to purchase
				System.out.println("Please write the product name you would like to add to the basket:");
				String inputProduct = in.nextLine();
				
				Product product = shop.searchProduct(inputProduct);
				//Check if the item they wrote is a product the shop sells
				if(product != null){
					
					//Add the product to the customer shopping basket
					customer.addToShoppingBasket(product);
					
					//Remove product from the shop
					shop.removeProduct(product);
					
				} else {
					System.out.println("That product doesn't exist");
				}
				
			} else if (input.equals("remove product")){
				//User wants to remove a product from their basket
				
				//Ask for the product name they would like to remove
				System.out.println("Please write the product name you would like to remove from basket:");
				String inputProduct = in.nextLine();
				
				Product product = customer.searchShoppingBasket(inputProduct);
				//Check if the item they wrote is a product the shop sells
				if(product != null){
					
					//Remove the product from the customers shopping basket
					customer.removeFromShoppingBasket(product);
					//Adds the product back tot he shop
					shop.addProduct(product);
					
				} else {
					System.out.println("That product doesn't exist");
				}
				
			} else if (input.equals("purchase")){
				//User wants to purchase products
				if(customer.purchaseProducts(shop)){
					//Returns true id transaction is successful
					System.out.println("You have successfully purchased your basket");
				} else {
					//Transaction was unsuccessful
					System.out.println("You do not have enough funds to buy that");
				}
			} else {
				//User didn't write a command
				System.out.println("Please write: 'exit', 'add product', 'remove product', or 'purchase'");
			}
			
			
		}
		
		in.close();
	}	
}