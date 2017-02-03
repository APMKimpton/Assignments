package term1.assignment5;

public class FlightSimulation{
	
	public static void main(String[] args){
		
		//*********************************************************************************************************************************************************************\\
		
		//Below lists the coordinates, destinations and aeroplane
		
		//*********************************************************************************************************************************************************************\\
		
		//Create coordinates
		Coordinates coordinates1 = new Coordinates(120,150);		
		//Create a destination
		Destination destination1 = new Destination("Cape Town", coordinates1);	
		
		//Create coordinates
		Coordinates coordinates2 = new Coordinates(50,100);
		//Create a destination
		Destination destination2 = new Destination("Lisbon", coordinates2);
		
		//Create coordinates
		Coordinates coordinates3 = new Coordinates(40,60);
		//Create a destination
		Destination destination3 = new Destination("Dublin", coordinates3);
		
		//Create coordinates for plane
		Coordinates coordinatesOfPlane = new Coordinates(120,150);		
		//Create an Aeroplane
		Aeroplane aeroplane = new Aeroplane("Falcon", coordinatesOfPlane, 16, 0, 5000);
		
		//*********************************************************************************************************************************************************************\\
		
		// Below lists all the flights
		
		//*********************************************************************************************************************************************************************\\
		
		//Local variable to temp hold the distance travelled
		int distanceTravelled;
		
		//Print what the plane will do next
		System.out.println(aeroplane.name() + " will be leaving " + destination1.name() + " it will be taking a single flight to " + destination2.name());
		//Make plane travel, and have the local variable hold the distance
		distanceTravelled = aeroplane.singleFlight(destination2);
		//Print the distance travelled and total distance
		System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());
			
		//Print what the plane will do next
		System.out.println(aeroplane.name() + " will be leaving " + destination2.name() + " it will be taking a single flight to " + destination3.name());
		//Make plane travel, and have the local variable hold the distance
		distanceTravelled = aeroplane.singleFlight(destination3);
		//Print the distance travelled and total distance
		System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());

		//Print what the plane will do next
		System.out.println(aeroplane.name() + " will be leaving " + destination3.name() + " it will be taking a single flight to " + destination2.name());
		//Make plane travel, and have the local variable hold the distance
		distanceTravelled = aeroplane.singleFlight(destination2);
		//Print the distance travelled and total distance
		System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());
		
		//Print what the plane will do next
		System.out.println(aeroplane.name() + " will be leaving " + destination2.name() + " it will be taking a single flight to " + destination1.name());
		//Make plane travel, and have the local variable hold the distance
		distanceTravelled = aeroplane.singleFlight(destination1);
		//Print the distance travelled and total distance
		System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());
		
		//*********************************************************************************************************************************************************************\\
		
		//Below lists my loop for handling the flights
		
		//Note to self - should it be reset?
		
		//*********************************************************************************************************************************************************************\\
		
		//Create a gap
		System.out.println("");
		
		//Local variable: Counter for repairs
		int repairCounter = 0;
		
		
		//Let day represent the day the plane is on
		for(int day = 1; day <= 120; day++){
			
			System.out.println("Day: " + day);
			System.out.println("Plane: " + aeroplane.name() + " has traveled a total distance of: " + aeroplane.totalDistance() + " units");
			
			if (aeroplane.totalDistance() < aeroplane.repairDistance()){
				//Print what the plane will do next
				System.out.println(aeroplane.name() + " will be leaving " + destination1.name() + " it will be taking a single flight to " + destination2.name());
				//Make plane travel, and have the local variable hold the distance
				distanceTravelled = aeroplane.singleFlight(destination2);
				//Print the distance travelled and total distance
				System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());
					
				//Print what the plane will do next
				System.out.println(aeroplane.name() + " will be leaving " + destination2.name() + " it will be taking a single flight to " + destination3.name());
				//Make plane travel, and have the local variable hold the distance
				distanceTravelled = aeroplane.singleFlight(destination3);
				//Print the distance travelled and total distance
				System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());

				//Print what the plane will do next
				System.out.println(aeroplane.name() + " will be leaving " + destination3.name() + " it will be taking a single flight to " + destination2.name());
				//Make plane travel, and have the local variable hold the distance
				distanceTravelled = aeroplane.singleFlight(destination2);
				//Print the distance travelled and total distance
				System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());
				
				//Print what the plane will do next
				System.out.println(aeroplane.name() + " will be leaving " + destination2.name() + " it will be taking a single flight to " + destination1.name());
				//Make plane travel, and have the local variable hold the distance
				distanceTravelled = aeroplane.singleFlight(destination1);
				//Print the distance travelled and total distance
				System.out.println(aeroplane.name() + " travelled: " + distanceTravelled + " units of distance and has travelled a total distance of: " + aeroplane.totalDistance());
			} else {				
				//Gets here if the plane needs to repair
				System.out.println("Plane will undergo repairs: it will be ready in 7 days");
				
				//Increment the repair counter
				repairCounter = repairCounter + 1;
				//Increment the day counter by 7 days (+6 because this day didn't fly either)
				day = day + 6;
				//Resets the total distance
				aeroplane.resetTotalDistance();
			}
			
		//Create a gap
		System.out.println("");
			
		} //End of for loop
		
		//Print the amount of times the plane needed repairs
		System.out.println("The plane had to undergo repairs " + repairCounter + " times");
		
		
	}
}