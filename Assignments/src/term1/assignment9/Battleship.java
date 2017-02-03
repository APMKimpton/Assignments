package term1.assignment9;

//Imports
import java.util.ArrayList;

public class Battleship{
	
	//Fields
	ArrayList<Part> parts;
	
	/**
	 * This Constructor takes 1 argument, the row
	 * This is the main constructor that gets called.
	 * It then calls the second constructor and passes the row and 5 - the length of a battleship
	 */
	public Battleship(int row){		
		this(row, 5);		
	}
	
	/**
	 * This Constructor takes 2 arguments, row and column
	 * The row and col are used to populate the parts array with parts
	 */
	public Battleship(int row, int column){
		
		//Initialise Variable
		parts = new ArrayList<Part>();
		
		//Fills the parts array with parts for the length of the ship
		for(int i = 0; i < column; i++){
			parts.add(new Part(row, i));
		}
		
	}
	
	/**
	 * This method takes 2 arguments, row and column
	 * They are used to make a new temporary part which is compared to all parts on the ship
	 * If any of these parts match, the matching ship part is destroyed and true is returned
	 * Otherwise false is returned
	 */
	public boolean hit(int row, int column){
		
		//Make a new parts
		Part tempPart = new Part(row, column);
		
		//Loop round each item in the parts array
		for(Part part : parts){
			if(part.equals(tempPart)){
				//Set that part to be destroyed
				part.setDestroyed();
				//Return that it was hit successfully.
				return true;		
			}		
		}
		//None of the parts matched
		return false;
			
	}
	
	/**
	 * This method takes 1 argument, ship
	 * It overrides the Object method
	 * it returns true if both ships are floating, or sinking
	 */
	public boolean equals(Object ship){
		
		//Check if the ship passed in is the correct obj
		if(!(ship instanceof Battleship)){
			return false;
		}
		
		//First check if the num of parts are the same - therefore same ship type
		if(((Battleship) ship).parts.size() == parts.size()){
			
			//Counter Variable to hold number of sunk parts for ship 1
			int counterOne = 0;
			
			//Counter Variable to hold number of sunk parts for ship 2
			int counterTwo = 0;
			
			//Loop over each part in the ship one
			for(Part part : ((Battleship) ship).parts){
				if(part.isDestroyed()){
					counterOne++;
				}
			}
			
			//Loop over each part in the ship two
			for(Part part : parts){
				if(part.isDestroyed()){
					counterTwo++;
				}
			}
			
			//Check if the ship's are destroyed
			if(counterOne == ((Battleship) ship).parts.size() && counterTwo == parts.size()){
				//Both ships are destroyed - therefore the same ship
				return true;
			}
			
			//Check if one ship is destroyed and the other isn't
			if(counterOne == ((Battleship) ship).parts.size() || counterTwo == parts.size()){
				//Ship is destroyed
				return false;
			}
			
			//Both ships are floating and are the same
			return true;		
		}
		
		//They are not equal / ship has sunk
		return false;
	}
	
	/**
	 * This method takes 0 arguments
	 * This is to override a method of object to return a string
	 * This toString returns all the parts of the ship, displaying if they have been hit or not
	 */
	public String toString(){
		
		//Local Variable to hold the string
		String baseString = "";
		
		for(Part part : parts){
			baseString += part;
		}
		
		return baseString;
	}
	
}