package year1.term1.assignment7;

public class GoldCoin{
	
	//Fields
	private static int totalCoins; //Private so no one knows how many coins there are
	private int coinNumber; //Public as it cannot be changed (is final)
	
	/**
	 * This Constructor takes 0 arguments
	 * The private static variable is incremented - its used to keep rack of total coins
	 * This value is assigned to coinNumber to act as a unique id
	 */
	public GoldCoin(){
		
		//Increment total amount of coins
		totalCoins++;
		
		//Set the unique number
		coinNumber = totalCoins;
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns the private field coinNumber
	 */
	public int coinNumber(){
		return coinNumber;
	}
	
}