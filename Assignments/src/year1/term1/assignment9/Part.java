package year1.term1.assignment9;

public class Part{
	
	//Fields
	private int row;
	private int column;
	private boolean destroyed;
	
	/**
	 * This Constructor takes 2 arguments, row and column
	 * these are stored as private fields
	 * It initially sets destroyed to false
	 */
	public Part(int row, int column){
		
		//Initialise Variables
		this.row = row;
		this.column = column;
		
		destroyed = false;
		
	}
	
	//Methods
	
	/**
 	 * This method takes 0 arguments 
	 * sets destroyed to true, this is irreversible
	 */
	public void setDestroyed(){
		destroyed = true;
	}
	
	/**
	 * This method takes 0 arguments
	 * Returns the private field value of destroyed
	 */
	public boolean isDestroyed(){
		return destroyed;
	}
	
	/**
	 * This method takes 0 arguments
	 * This method is an override method for the toString in objects
	 * Returns an empty bracket or one filled with an X based on destroyed field
	 */
	public String toString(){
		if(destroyed){
			return "[X]";
		} else {
			return "[ ]";
		}
	}
	
	/**
	 * This method takes 1 argument, part
	 * First this part is used to check if it is a Part obj
	 * Each row and column is compared, they are are the same, then the objs are equal
	 * otherwise false is returned
	 */
	public boolean equals(Object part){
		
		//Check if the ship passed in is the correct obj
		if(!(part instanceof Part)){
			return false;
		}
		//If the objects are the same, return true
		if(((Part) part).row == row && ((Part) part).column == column){
			return true;
		}
		
		//They are not equal
		return false;
		
	}
	
	
}