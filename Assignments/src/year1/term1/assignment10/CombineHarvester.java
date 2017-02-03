package year1.term1.assignment10;

public class CombineHarvester extends Harvester{
	
	//Fields
	private int length;
	
	/**
	 * This constructor takes 3 arguments, fuelTankSize, topSpeed and length
	 * fuelTankSize and topSpeed are sent to the super constructor, while length is initialised with the value passed
	 */
	public CombineHarvester(int fuelTankSize, int topSpeed, int length){
		super(fuelTankSize, topSpeed);
		this.length = length;
	}
	
	/**
	 * This method takes 0 arguments
	 * This method calls the super's harvestingCapacity method and multiples the result by length
	 * It then returns this value
	 */
	public int harvestingCapacity(){
		return (super.harvestingCapacity() * length);
	}
}