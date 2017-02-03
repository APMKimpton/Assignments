package year1.term1.assignment10;

//Imports
import java.util.ArrayList;

public class Field{
	
	//Fields (Lol)
	private ArrayList<Crop> crops;
	public static final int maxNumOfCrops = 10;
	private String type;
	private int value;
	
	/**
	 * This constructor takes 2 arguments, type and value
	 * The type is a string, to represent the type of the crop's on the field
	 * The value is the profit made from selling each crop on the field
	 * This also calls a plant method to plant the fields crops
	 */
	public Field(String type, int value){
		
		//Initialise Variables
		crops = new ArrayList<Crop>();
		this.type = type;
		this.value = value;	

		//Plant the field
		this.plant();
	}
	
	/**
	 * This method takes 0 arguments
	 * It loops over the maximum amount of crops to be planted and plants them
	 */
	public void plant(){
		//Add the crops to the field
		for(int i = 0; i < maxNumOfCrops; i++){
			crops.add(new Crop(type, value));
		}
	}
	
	/**
	 * This method takes 0 arguments
	 * It calculates the profit on the farm and returns this value
	 * It also removes all crops off the field
	 */
	public int harvest(){
		//Local Variable to hold the value of this harvest
		int totalValue = 0;
		
		//Loop over all the crops and increment the temp value
		for(Crop crop : crops){
			//Increment the total value
			totalValue += crop.getValue();
		}
		
		//Clear the array
		crops.clear();
		
		return totalValue;
	}
	
	
}