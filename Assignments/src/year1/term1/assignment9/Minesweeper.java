package year1.term1.assignment9;

public class Minesweeper extends Battleship{
	
	/**
	 * This Constructor takes 1 argument, row
	 * This then calls the super constructor passing the row and 2
	 * 2 is the part length of this ship
	 */
	public Minesweeper(int row){
		
		super(row, 2);
		
	}
	
	/**
	 * This method takes 2 arguments, row and column
	 * There is a 50% chance that the person misses
	 * If it hits, it calls the parent hit method and returns the value
	 * otherwise false is returned
	 */
	public boolean hit(int row, int column){
		
		//Local Variable to hold the random integer of 0 or 1
		int randomNumber = (int) (Math.random() * 2);
		
		//Checks if its 0 or 1
		if(randomNumber == 0){
			//Ship is hit
			return super.hit(row, column);
		} else {
			//Ship is not hit
			return false;
		}
				
		
	}		
			
	
}