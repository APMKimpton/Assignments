package term1.assignment5;

public class Aeroplane{
	
	//Fields
	private String name;
	private Coordinates coordinates;
	private int speed;
	private int totalDistance;
	private int repairDistance;
	
	public Aeroplane(String name, Coordinates coordinates, int speed, int totalDistance, int repairDistance){
		
		//Initialise Variables
		this.name = name;
		this.coordinates = coordinates;
		this.speed = speed;
		this.totalDistance = totalDistance;
		this.repairDistance = repairDistance;
		
	}
	
	//Get name
	public String name(){
		return name;
	}
	
	//Get repairDistance
	public int repairDistance(){
		return repairDistance;
	}
	
	//Get totalDistance
	public int totalDistance(){
		return totalDistance;
	}
	
	//Resets total distance
	public void resetTotalDistance(){
		totalDistance = 0;
	}
	
	//Method to calculate a single flight
	public int singleFlight(Destination destination){
		
		//Local Variable - used for the return value
		int totalDistanceCopy = totalDistance;		
		
		//A loop to check if coordinates are not equal
		while(destination.coordinates().x() != coordinates.x() || destination.coordinates().y() != coordinates.y()){
			
			//*****************************************************************************\\
			
			//Move aeroplane in x coordinate
			if(destination.coordinates().x() < coordinates.x()){
				//Plane needs to move negatively in x direction				
				//Local Variable - Get the distance between the two positions
				int distance = coordinates.x() - destination.coordinates().x();				
				if(distance < speed){					
					//If the distance is less than the speed
					coordinates.updateX(-distance);
					//Update total distance travelled
					totalDistance = totalDistance + distance;
				} else {					
					//If the distance between them is greater than or equal to speed
					coordinates.updateX(-speed);
					//Update total distance travelled
					totalDistance = totalDistance + speed;
				}
				
			} else if(destination.coordinates().x() > coordinates.x()){				
				//Plane needs to move positively in x direction				
				//Local Variable - Get the distance between the two positions
				int distance = destination.coordinates().x() - coordinates.x();				
				if(distance < speed){					
					//If the distance is less than the speed
					coordinates.updateX(distance);
					//Update total distance travelled
					totalDistance = totalDistance + distance;
				} else {					
					//If the distance between them is greater than or equal to speed
					coordinates.updateX(speed);	
					//Update total distance travelled
					totalDistance = totalDistance + speed;					
				}				
			}
			
			//*****************************************************************************\\
			
			//Move aeroplane in y coordinate
			if(destination.coordinates().y() < coordinates.y()){
				//Plane needs to move negatively in y direction				
				//Local Variable - Get the distance between the two positions
				int distance = coordinates.y() - destination.coordinates().y();				
				if(distance < speed){					
					//If the distance is less than the speed
					coordinates.updateY(-distance);
					//Update total distance travelled
					totalDistance = totalDistance + distance;	
				} else {					
					//If the distance between them is greater than or equal to speed
					coordinates.updateY(-speed);
					//Update total distance travelled
					totalDistance = totalDistance + speed;	
				}
				
			} else if(destination.coordinates().y() > coordinates.y()){				
				//Plane needs to move positively in y direction				
				//Local Variable - Get the distance between the two positions
				int distance = destination.coordinates().y() - coordinates.y();				
				if(distance < speed){					
					//If the distance is less than the speed
					coordinates.updateY(distance);
					//Update total distance travelled
					totalDistance = totalDistance + distance;	
				} else {					
					//If the distance between them is greater than or equal to speed
					coordinates.updateY(speed);
					//Update total distance travelled
					totalDistance = totalDistance + speed;				
				}				
			}
			
			//*****************************************************************************\\
			
		} //End of while loop
		
		//Calculate the distance travelled in the flight and return it
		return (totalDistance - totalDistanceCopy);	
		
	} //End of single flight
}