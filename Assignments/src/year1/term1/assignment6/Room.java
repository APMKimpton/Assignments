package year1.term1.assignment6;
public class Room{
	
	//Fields
	private String name;
	private Room blueDoorRoom;
	private Room redDoorRoom; 
	private boolean containsMonster;
	private boolean isFinalRoom;
	
	//Generic Room Constructor
	public Room(String name, Room blueDoorRoom, Room redDoorRoom){
		
		//Initialise Variables
		this.name = name;
		this.blueDoorRoom = blueDoorRoom;
		this.redDoorRoom = redDoorRoom;
		this.containsMonster = false;
		this.isFinalRoom = false;
		
	}
	
	//Monster Room Constructor
	public Room(boolean containsMonster, String name){
		
		//Initialise Variables
		this.name = name;
		this.containsMonster = containsMonster;
		
	}
	
	//Final Room Constructor
	public Room(String name, boolean isFinalRoom){
		
		//Initialise Variables
		this.name = name;
		this.isFinalRoom = isFinalRoom;
		
	}
	
	//Getters
	public boolean containsMonster(){
		return containsMonster;
	}
	public Room redDoorRoom(){
		return redDoorRoom;
	}
	public Room blueDoorRoom(){
		return blueDoorRoom;
	}
	public String name(){
		return name;
	}
	public boolean isFinalRoom(){
		return isFinalRoom;
	}
}