package year1.term1.assignment3;

public class Car{
	
	//Fields
	private int id;
	private int fuel;
	private int lowFuelBoost;
	private int highFuelSlowdown;
	private int fuelConsumptionPerLap;
	private int pitStoptotalTime;
	private int rainSlowdown;
	private int totalTime;
	
	//Methods
	
	//Constructor Method
	public Car(int id, int fuel, int lowFuelBoost, int highFuelSlowdown, int fuelConsumptionPerLap, int pitStoptotalTime, int rainSlowdown, int totalTime){
		
		//Catch if starting fuel was above 100
		if(fuel > 100){
			fuel = 100;
		} else if(fuel < 0){
			fuel = 0;
		}
		
		//Initialise the fields
		this.id = id;
		this.fuel = fuel;
		this.lowFuelBoost = lowFuelBoost;
		this.highFuelSlowdown = highFuelSlowdown;
		this.fuelConsumptionPerLap = fuelConsumptionPerLap;
		this.pitStoptotalTime = pitStoptotalTime;
		this.rainSlowdown = rainSlowdown;
		this.totalTime = totalTime;
		
		
		
	}
	
	//Returns totalTime to complete a lap
	public int completeLap(int averageLapTime, boolean isRaining){
		
		//Adds the base time to the total time
		totalTime = totalTime + averageLapTime;
		
		//Checks if the car needs a pitstop
		if(fuel < fuelConsumptionPerLap){
			totalTime = totalTime + pitStoptotalTime;
			fuel = 100;
		}	
		
		//Checks if fuel is above 50, adds to totalTime accordingly
		if(fuel > 50){
			totalTime = totalTime + highFuelSlowdown;
		}else{
			totalTime = totalTime - lowFuelBoost;
		}
		
		//Checks if it is raining, adds to totalTime accordingly
		if(isRaining){
			totalTime = totalTime + rainSlowdown;
		}
		
		//Reduces the fuel by the amount specified per lap
		fuel = fuel - fuelConsumptionPerLap;
		
		//Returns the amount of totalTime taken to complete a lap		
		return totalTime;
		
	}
	
	//Returns the id of the car
	public int getId(){
		return id;
	}
	
}