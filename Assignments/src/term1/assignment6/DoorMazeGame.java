package term1.assignment6;

import java.util.Scanner;

public class DoorMazeGame{
	
	//Main Method
	
	public static void main(String[] args){
		
		//Create a monster room
		Room monsterRoom = new Room(true, "The Monster Room");
		
		//Create the Final Room
		Room room6 = new Room("The Great Hall", true);
		
		//Creates all the main rooms
		Room room5 = new Room("The Fifth Hall", room6, monsterRoom);
		Room room4 = new Room("The Fourth Hall", monsterRoom, room5);
		Room room3 = new Room("The Third Hall", room4, monsterRoom);
		Room room2 = new Room("The Second Hall", room3, monsterRoom);
		Room room1 = new Room("The First Hall", monsterRoom, room2);
		
		//Creates a player
		Player player = new Player(2, room1);
		
		//Initialise a scanner object
		Scanner in = new Scanner(System.in);
		
		//Output games rules
		System.out.println("Welcome to the Door Maze Game!");
		System.out.println(""); // Create spacing
		System.out.println("The Rules are as follows: ");
		System.out.println("You will be presented with 2 doors, a blue one and a red one.");
		System.out.println("You must select a door, one will allow you to progress, while the other unleases a monster.");
		System.out.println("If you are attacked by a monster, you will lose a life. You only have 2, so be careful");
		System.out.println("If you select a valid door, you will progress to the next set, until you reach the final door");
		System.out.println("If you make it to the final door, you have won! Good luck!");
		System.out.println(""); // Create spacing
		System.out.println(""); // Create spacing
		//Ask user for their name
		//Ask the user for their name, bind it to the field in the player class
		System.out.println("What is your name? ");
		player.setName(in.nextLine());
		System.out.println(""); // Create spacing
		System.out.println(""); // Create Spacing
		
		//Local Variables
		String inputString; //Used to hold the input values
		boolean successfullyMoved;
		
		System.out.println("-------------------------------------------------------------------------------"); //Create Spacing
		
		//Keeps the game running while the player has lives
		while(player.lives() > 0){
			
			//Checks if it is the final door
			if(player.currentRoom().isFinalRoom()){
				System.out.println(""); // Create Spacing
				System.out.println("You made it to the last door, you have won! Congratulations!");
				break;
			}
			
			
			//Details about th player
			System.out.println("Player: " + player.name() + "    Lives Left: " + player.lives() + "    Current Room: " + player.currentRoom().name());
			System.out.println(""); // Create Spacing
			System.out.println("Please select a door, 'red' or 'blue': ");
			inputString = in.nextLine();
				
			
			if(inputString.equals("red")){
				//If they enter red
				successfullyMoved = player.move(player.currentRoom().redDoorRoom());
				
				//If they successfully moved or not
				if(successfullyMoved){
					//They did move successfully
					System.out.println("You guessed correctly, you have moved to room: " + player.currentRoom().name());
					System.out.println("-------------------------------------------------------------------------------"); //Create Spacing
				} else {
					//The monster got them
					player.updateLives(-1); // remove one life
					System.out.println("You were hit by the monster! You lost a life!");
					System.out.println("-------------------------------------------------------------------------------"); //Create Spacing
				}
				
			} else if(inputString.equals("blue")){
				//if they enter blue
				successfullyMoved = player.move(player.currentRoom().blueDoorRoom());
				
				//If they successfully moved or not
				if(successfullyMoved){
					//They did move successfully
					System.out.println("You guessed correctly, you have moved to room: " + player.currentRoom().name());
					System.out.println("-------------------------------------------------------------------------------"); //Create Spacing
				} else {
					//The monster got them
					player.updateLives(-1); // remove one life
					System.out.println("You were hit by the monster! You lost a life!");
					System.out.println("-------------------------------------------------------------------------------"); //Create Spacing
				}
				
			} else {
				//Case when they don't enter blue or red
				System.out.println(""); // Create spacing
				System.out.println("You did not enter 'red' or 'blue' to enter through the red or blue door respectively, please try again.");
				System.out.println("-------------------------------------------------------------------------------"); //Create Spacing
			}
			
		}
		
		//Clause if they lose the game
		if(player.lives() == 0){
			//They lost message
			System.out.println(""); // Create Spacing
			System.out.println("Sorry, the monster got you and you ran out of lives! You have lost!");
		}
		
		in.close();
		
	}	
	
}