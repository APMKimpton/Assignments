package term1.assignment10;

//Imports
import java.util.ArrayList;

public class Farm{
	
	//Fields
	private ArrayList<Field> fields;
	private ArrayList<Harvester> harvesters;
	private int profit;
	
	/**
	 * This constructor takes 0 arguments
	 * It first initialises all variables and sets profit to 0
	 */
	public Farm(){
		
		//Initialise Variables
		fields = new ArrayList<Field>();
		harvesters = new ArrayList<Harvester>();
		
		profit = 0;
		
	}
	
	/**
	 * This method takes 1 argument, a harvester object
	 * this object is added to the harvester array
	 */
	public void addHarvester(Harvester harvester){
		//Adds the supplied harvester to the array
		harvesters.add(harvester);
	}
	
	/**
	 * This method takes 2 arguments, type and value
	 * these are used to create a new field and append it to the fields array
	 */
	public void addField(String type, int value){
		//Adds a new field with the parameters provided
		fields.add(new Field(type, value));
	}
	
	/**
	 * This method takes 0 arguments
	 * It returns profit made by the farm
	 */
	public int profitMade(){
		return profit;
	}
	
	/**
	 * This method takes 0 arguments
	 * This method calculates how much profit is made on the farm, and removes all the crops
	 * it then updates the profit field
	 */
	public void harvest(){
		//Local Variable to calculate the harvest capacity
		int totalHarvestCap = 0;
		
		//Loop over all harvesters
		for(Harvester harvester : harvesters){
			//Increment the value
			totalHarvestCap += harvester.harvestingCapacity();
		}
		
		//Case 1: harvest cap is not sufficient
		if(totalHarvestCap < fields.size()){
			//Do as many fields as we can, add to profit
			for(int i = 0; i < totalHarvestCap; i++){
				profit += fields.get(i).harvest();
			}
		} else {
			//Case 2: all fields can be harvest
			//Loop over all fields and harvest them, add to profit
			for(Field field : fields){
				profit += field.harvest();
			}
		}
	}
	
}