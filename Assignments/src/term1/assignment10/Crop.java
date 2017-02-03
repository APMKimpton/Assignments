package term1.assignment10;

public class Crop{
	
	//Fields
	private String type;
	private int value;
	
	/**
	 * This constructor takes 2 arguments, type and value
	 * The type is a string, to represent the type of the crop
	 * The value is the profit made from selling the crop
	 */
	public Crop(String type, int value){
		
		//Initialise variables
		this.type = type;
		this.value = value;
		
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns the value of the crop
	 */
	public int getValue(){
		return value;
	}
	
	
}