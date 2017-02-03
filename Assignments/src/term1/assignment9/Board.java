package term1.assignment9;

//Imports
import java.util.ArrayList;

public class Board{
	
	//Fields
	ArrayList<Battleship> ships;
	
	/**
	 * This Constructor takes 0 arguments
	 * First it initialises the array
	 * it then populates the array with 5 ships at specified rows
	 */
	public Board(){
		
		//Initialise ships
		ships = new ArrayList<Battleship>();
		
		//Create the ships and add them to ships
		ships.add(new Battleship(0)); // Adds a BS to ships on row 0
		ships.add(new Cruiser(1)); // Adds a C to ships on row 1
		ships.add(new Cruiser(2)); // Adds a C to ships on row 2
		ships.add(new Frigate(3)); // Adds a F to ships on row 3
		ships.add(new Minesweeper(4)); // Adds a MS to ships on row 4	
		
	}
	
	/**
	 * This method takes 0 arguments
	 * Returns the ships array
	 */
	public ArrayList<Battleship> getShips(){
		return ships;
	}
	
	/**
	 * This method takes 2 arguments, row and column
	 * It loops through all the ships in the ships array and checks if of of them are hit
	 * If they are, it returns true,
	 * Otherwise, false is returned
	 */
	public boolean hitLocation(int row, int column){		
		//Loop for each item in ships
		for(Battleship ship : ships){
			if(ship.hit(row, column)){
				return true;
			}
		}
		//Ship was not hit
		return false;
	}
	
	/**
	 * This method takes 0 arguments
	 * This method is used to override the toString method in object
	 * It creates a 5x5 board and fills the gaps with empty boxes
	 * This is based on the position of ships in the ships array
	 */
	public String toString(){
		
		//Base String
		String baseString = "";
		
		String blank = "[ ]";
		
		//Loop through each ship on the ships array
		for(Battleship ship : ships){
			baseString += ship;
			
			//Local variable to hold the amount of spaces needed to append on the end
			int spaces;
			
			//Find out what type the ship is
			if(ship instanceof Cruiser){
				spaces = 1;
			} else if(ship instanceof Frigate){
				spaces = 2;
			} else if(ship instanceof Minesweeper){
				spaces = 3;
			} else {
				//Assumed to be the parent, a Battleship
				spaces = 0;
			}
			
			//Fill the remaining space with blanks			
			for(int i = 0; i < spaces; i++){
				baseString += blank;
			}
			
			
			//Create a new line for the next ship
			baseString += "\n";
			
		}
		
		return baseString;
		
	}
	
}