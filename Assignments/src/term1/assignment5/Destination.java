package term1.assignment5;

public class Destination{
	
	//Fields
	private String name;
	private Coordinates coordinates;
	
	//Constructor
	public Destination(String name, Coordinates coordinates){
		
		//Initialise Variables
		this.name = name;
		this.coordinates = coordinates;

	}
	
	//Getters
	public String name(){
		return name;
	}
	
	public Coordinates coordinates(){
		return coordinates;
	}
	
}