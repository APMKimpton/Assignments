package year1.term1.assignment10;

public class Harvester{
	
	//Fields
	private int fuelTankSize;
	private int topSpeed;
	
	/**
	 * This constructor takes 2 arguments, fuelTankSize and topSpeed
	 * The fuelTankSize and topSpeed are initialised with the values parsed in
	 */
	public Harvester(int fuelTankSize, int topSpeed){
		
		//Initialise Variables
		this.fuelTankSize = fuelTankSize;
		this.topSpeed = topSpeed;
		
	}
	
	/**
	 * This method takes 0 arguments
	 * this method returns the sum of the fuelTankSize and topSpeed
	 * This value acts as the total harvesting capacity of this harvester
	 */
	public int harvestingCapacity(){
		return (topSpeed + fuelTankSize);
	}
}