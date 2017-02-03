package term1.assignment3;

public class RaceSimulator{
	
	public static void main(String[] args){
		
		//Creates a new racetrack called Silver Stone
		RaceTrack silverstone = new RaceTrack(112, false);
		
		//Creates 3 new cars
		Car car1 = new Car(1,79,6,5,19,25,15,0);
		Car car2 = new Car(2,67,8,4,29,16,11,0);
		Car car3 = new Car(3,41,7,6,31,18,13,0);
		
		//Local variable to hold the lead car in each race
		int carId;
		
		//Race once and print the leader
		carId = silverstone.determineRaceLeader(car1, car2, car3);
		System.out.println("Leader of lap 1");
		System.out.println(carId);
		System.out.println("");
		
		//Race a second time and prints the leader
		carId = silverstone.determineRaceLeader(car1, car2, car3);
		System.out.println("Leader of lap 2");
		System.out.println(carId);
		System.out.println("");
		
		//make Silver Stone rain
		silverstone.changeRain(true);
		
		//Race a third time and prints the leader
		carId = silverstone.determineRaceLeader(car1, car2, car3);
		System.out.println("Leader of lap 3 and winner of the race");
		System.out.println(carId);
		System.out.println("");
	}
}