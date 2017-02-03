package term1.assignment7;

public class TreasureChest{
	
	//Fields
	public static final int chestSize = 20;
	private GoldCoin[] goldCoins;
	
	/**
	 * This constructor takes 0 arguments
	 * It is used to initialise the goldCoinsArray and fill the array
	 */
	public TreasureChest(){
		
		//Set the size of the chest
		goldCoins = new GoldCoin[chestSize];
		
		//Fills all 20 spaces of the goldCoins array with gold coins
		for(int i = 0; i < chestSize; i++){
			goldCoins[i] = new GoldCoin();
		}
		
	}
	
	/**
	 * takeOneGoldCoin takes no arguments
	 * It returns a single goldCoin from the goldCoins array
	 * It always takes the last goldCoin on the array	
	 */
	public GoldCoin takeOneGoldCoin(){
		
		//Local Variable to hold the removed coin
		GoldCoin removedCoin;
		
		//Loop to iterate over the array
		for(int i = 0; i < chestSize; i++){
			//So if the next item in the array is null or at the end of the array:
			if(i == (chestSize -1) || goldCoins[i+1] == null){
				//Save the coin to the local variable
				removedCoin = goldCoins[i];
				//Delete the coin from the chest
				goldCoins[i] = null;
				//Return the coin
				return removedCoin;
			}			
		}
		
		//If they tried to remove a coin that doesn't exist:
		return null;
	}
	

}