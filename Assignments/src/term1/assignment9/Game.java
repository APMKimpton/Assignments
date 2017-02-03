package term1.assignment9;

//Imports
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Game{
	
	/**
	 * This method takes 1 argument, args
	 * This is the main method that controls the flow of the program
	 */
	public static void main(String[] args){
		
		//Create a board
		Board board = new Board();
		
		//Create a scanner
		Scanner in = new Scanner(System.in);
		
		//Local Variables
		ArrayList<Battleship> ships;
		Battleship battleShip = new Battleship(0);
		Battleship cruiser = new Cruiser(0);
		Battleship frigate = new Frigate(0);
		Battleship minesweeper = new Minesweeper(0);
		String input = "";
		int battleShips;
		int cruisers;
		int frigates;
		int minesweepers;
		
		//Main Loop
		while(true){
			
			//Get the ships array
			ships = board.getShips();
			
			//Get the frequency of each type in the ships array
			battleShips = Collections.frequency(ships, battleShip);
			cruisers = Collections.frequency(ships, cruiser);
			frigates = Collections.frequency(ships, frigate);
			minesweepers = Collections.frequency(ships, minesweeper);
			
			//Print out the numbers
			System.out.println("Number of BattleShips: " + battleShips);
			System.out.println("Number of Cruisers: " + cruisers);
			System.out.println("Number of Frigates: " + frigates);
			System.out.println("Number of Minesweepers: " + minesweepers + "\n");
			
			//Print the board
			System.out.println(board + "\n");
			
			//Ask the user to write a row an column
			System.out.println("Please write row and column: i.e '2 5'");			
			input = in.nextLine();
			
			//Check if they wrote quit
			if(input.equals("quit")){
				break;
			}
			
			//Save the inputs as two new strings
			String row = "" + input.charAt(0);
			String column = "" + input.charAt(2);		
			
			//Check if it hit anything
			if(board.hitLocation(Integer.parseInt(row), Integer.parseInt(column))){
				System.out.println("Hit \n");
			} else {
				System.out.println("Miss \n");
			}
			
		}
		
		in.close();
		
	}
}