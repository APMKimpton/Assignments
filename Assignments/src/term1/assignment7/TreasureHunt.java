package term1.assignment7;

import java.util.Scanner;

public class TreasureHunt{
	
	/**
	 * Main Method to act as a Driver Class
	 */
	public static void main(String[] args){
		
		
		//Create the islands
		Island guadeloupeIsland = new Island(10, "Guadeloupe");
		Island portRoyalIsland = new Island(10, "Port Royal");
		Island tortugaIsland = new Island(10, "Tortuga");
		//Add these islands to a map
		//Create a map
		Island[] map = {guadeloupeIsland, portRoyalIsland, tortugaIsland};
		
		//Create a pirate (with 'appropriate' name) and pass map
		Pirate pirate = new Pirate("Capain Chapbeard", map);
		
		//Create a scanner object
		Scanner in = new Scanner(System.in);
		
		//Local Variable to hold input and a island
		String input;
		Island island;
		
		//Let pirate introduce himself
		pirate.speak("My name is " + pirate.name());
		
		
		//Create a loop that will continue to run
		while(true){
			//Display for each loop
			pirate.speak("I have " + pirate.totalCoins() + " gold coins");
			//Ask user for input
			pirate.speak("Where would you like to go");
			input = in.nextLine();
			
			//Check if they wrote stop
			if("stop".equals(input)){
				pirate.speak("Thanks for navigating me, I have " + pirate.totalCoins() + " coins in my purse");
				break;
			}
			
			
			island = pirate.search(input);
			
			//Condition statement to check if the island exists
			if(island != null){
				//Island exists
				pirate.speak("I have found " + input + " island");
				pirate.speak("I'm looking for treasure");
				
				//condition to check if there was treasure
				if(pirate.getTreasure(island)){
					pirate.speak("I found some treasure");
				} else {
					pirate.speak("It's already been plundered");
				}
				
			} else {
				//Island doesn't exit
				pirate.speak("I couldn't find " + input + " on my map");
			}
			
		}
		
		//Close input Stream
		in.close();
		
		
	}
	
}