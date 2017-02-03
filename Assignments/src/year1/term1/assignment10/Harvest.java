package year1.term1.assignment10;

public class Harvest{
	
	/**
	 * This method takes 1 argument, args
	 * This arguments are not used
	 * This method controls the flow of the program as its the main method
	 */
	public static void main(String[] args){
		
		//Create a farm
		Farm farm = new Farm();
		
		//Add a harvester to the farm
		farm.addHarvester(new Harvester(1, 1));
		
		//Add a conbine harvester
		farm.addHarvester(new CombineHarvester(2, 2, 3));
		
		//Add 5 corn fields
		for(int i = 0; i < 5; i++){
			farm.addField("Corn", 20);
		}
		
		//Add 5 wheat fields
		for(int i = 0; i < 5; i++){
			farm.addField("Wheat", 20);
		}
		
		//Add 5 oats fields
		for(int i = 0; i < 5; i++){
			farm.addField("Oats", 20);
		}
		
		//Add 5 barley fields
		for(int i = 0; i < 5; i++){
			farm.addField("Barley", 20);
		}
		
		//Harvest the farm
		farm.harvest();
		
		//Print the farms profit
		System.out.println("The farm has made a profit of: " + farm.profitMade() + " pounds!");
	}
	
}