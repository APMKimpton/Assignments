package year1.term1.assignment7;

public class Island{
	
	//Fields
	private String name;
	private TreasureChest[] locations;
	
	/**
	 * This constructor takes 2 arguments
	 * 		One is for the possible bury locations on the island
	 * 		One is used for the name of the island
	 * One of the locations in the locations array is populated with a TreasureChest
	 */
	public Island(int possibleBuryLocations, String name){
		
		//Initialise variables
		this.name = name;
		this.locations = new TreasureChest[possibleBuryLocations];
		
		//Bury a treasure chest at a location at random
		int buryLocation = (int) (Math.random() * possibleBuryLocations);
		this.locations[buryLocation] = new TreasureChest();
	}
	
	/**
	 * This method takes 1 argument
	 * The argument is an int and is used to check a position in an array
	 * If that position is not in the correct range or contains null, null is returned
	 * If the location contains a chest,
	 * The chest removed from the array and returned
	 */
	public TreasureChest dig(int location){
		//If they supply a number greater than the array length
		if(location >= locations.length || location < 0){
			//Return no chest
			return null;
		}
		
		//If the location contains a treasure chest then:
		if(locations[location] != null){
			//Local Variable
			TreasureChest treasure = locations[location];
			//Remove the chest from that location
			locations[location] = null;
			//Return the chest
			return treasure;
		} else {
			//There was no chest, return no chest.
			return null;
		}
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns the private field name
	 */
	public String name(){
		//Return name of island
		return name;
	}
	
	/**
	 * This method takes 0 arguments and returns an int
	 * The length of the locations array is returned
	 */
	public int locations(){
		//Return number of locations on island
		return locations.length;
	}
	
}