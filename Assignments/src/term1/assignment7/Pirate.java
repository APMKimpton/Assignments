package term1.assignment7;

public class Pirate{
	
	//Fields
	private String name;
	private GoldCoin[] purse;
	private Island[] map;
	
	/**
	 * This constructor takes 2 arguments:
	 * 		One is for the name of the pirate
	 *		One is for the map the pirate will use
	 * This also creates the max size of the purse based on map size and chest size
	 */
	public Pirate(String name, Island[] map){
		
		//Initialise Variables
		this.name = name;
		this.map = map;
		
		//'Smart' algorithm to figure max size of the purse
		purse = new GoldCoin[map.length * TreasureChest.chestSize];
		
	}
	
	/**
	 * Method takes one argument for matching the user inputed value to an island name
	 * A loop is used to iterate over then entire array of islands on the map
	 */
	public Island search(String name){
		//Loop to search all islands
		for(int i = 0; i < map.length; i++){			
			//Compare each name of island to provided name
			if(name.equalsIgnoreCase(map[i].name())){
				return map[i]; //This also breaks the loop
			}			
		}
		
		//If they make it here, that island doesn't exist
		return null;
	}
	
	/**
	 * This method takes one argument: an Island instance,
	 * this is used to iterate over each location on the island.
	 * If a chest is found on a location, every coin is taken from the chest, and the chest is removed
	 * The coins are added to this instance's purse
	 */
	public boolean getTreasure(Island island){
		//Local variable to hold the Treasure Chest
		TreasureChest chest;
		//Local variable to hold the coins
		GoldCoin coin;
		
		//Loop on the locations in the island
		for(int i = 0; i < island.locations(); i++){
			//Store contents of chest in this temp variable
			chest = island.dig(i);
			
			//Check if it contains a chest
			if(chest != null){
				//Gets here if there is a chest
				
				//Loop for coins in the chest
				for(int j = 0; j < TreasureChest.chestSize; j++){
					//Get the coin
					coin = chest.takeOneGoldCoin();
					
					//Loop to append the coin to the purse
					for(int k = 0; k < purse.length; k++){
						if(purse[k] == null){
							purse[k] = coin;
							break; //Only breaks first loop
						}
					}
				}
				//Return that it was successful
				return true;
			}			
		}
		
		//If they get here, there was no chest
		return false;
	}
	
	/**
	 * This method takes 0 arguments
	 * It loops over the array 'Purse' to find how many coins there are
	 * This value is then returned
	 */
	public int totalCoins(){
		//Loop to check null values in purse
		for(int i = 0; i < purse.length; i++){
			//Checks if current position is null
			if(purse[i] == null){
				return i;
			}		
		}
		
		//If they get here, all values in purse array are full
		return purse.length;
		
	}
	
	/**
	 * This method takes 1 argument: String labelled phrase
	 * A temporary array is made for all affixes to be added to phrase
	 * An affix is chosen at random using Math.random() * 5 (Produces a vlaue between 0-4)
	 * The affix is appended onto the end of phrase, and then printed to the terminal
	 */
	public void speak(String phrase){
		//Randomly choose a number between 0-4
		int suffixNumber = (int) (Math.random() * 5);
		
		//Array to hold suffix
		String[] suffix = {", arrr!", ", shiver me timbers!", ", avast!", ", ahoy, matey!", ", yo, ho ho!"} ;
		
		//Prints this speach out
		System.out.println(phrase + suffix[suffixNumber]);
		
	}
	
	/** 
	 * This method takes 0 arguments
	 * it returns the private field name
	 * This is a String
	 */
	public String name(){
		return name;
	}
	
	
}