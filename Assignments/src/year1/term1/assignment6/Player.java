package year1.term1.assignment6;
public class Player{
	
	//Fields
	private String name;
	private int lives;
	private Room currentRoom;
	
	//Constructor
	public Player(int lives, Room currentRoom){
		
		//Initialise Variables
		this.lives = lives;
		this.currentRoom = currentRoom;
		
	}
	
	//Set the players name
	public void setName(String name){
		this.name = name;
	}
	
	//Updates the lives
	public void updateLives(int lives){
		this.lives = this.lives + lives;
	}
	
	//Move player to a new room
	public boolean move(Room room){
		//Checks if the door is correct (if it doesn't have a monster)
		if(room.containsMonster()){
			//This room is wrong
			return false;
		} else {
			//Room is valid
			
			//Move the player to the next room
			currentRoom = room;
			return true;
		}
	}
	
	//Getters
	public int lives(){
		return lives;
	}
	
	public String name(){
		return name;
	}
	
	public Room currentRoom(){
		return currentRoom;
	}
	
}