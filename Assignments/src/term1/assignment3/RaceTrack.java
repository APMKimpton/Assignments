package term1.assignment3;

public class RaceTrack{
	
	//Fields
	private int averageLapTime;
	private boolean isRaining;
	
	//Methods
	
	//Constructor Method
	public RaceTrack(int averageLapTime, boolean isRaining){
		
		//Initialises the starting fields
		this.averageLapTime = averageLapTime;
		this.isRaining = isRaining;
	}
	
	//Returns the leader of the race
	public int determineRaceLeader(Car car1, Car car2, Car car3){
		
		//Finds the time so far in the race of each car after completing a lap
		int car1Time = car1.completeLap(averageLapTime, isRaining);
		int car2Time = car2.completeLap(averageLapTime, isRaining);
		int car3Time = car3.completeLap(averageLapTime, isRaining);
		
		
		//Determines who is the winner
		if(car1Time < car2Time && car1Time < car3Time){
			return car1.getId();
		} else if (car2Time < car1Time && car2Time < car3Time) {
			return car2.getId();
		} else {
			return car3.getId();
		}
				
	}
	
	
	//Allows the rain to change
	public void changeRain(boolean isRaining){
		this.isRaining =  isRaining;
	}
	
	
	
	
}