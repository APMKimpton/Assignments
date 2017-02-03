package term1.assignment2;

public class Person{
	
	//Fields
	private int calories;
	
	//Constructor
	public Person(){
		calories = 0;
	}
	
	//Methods	
	//Uses the object of the meal class to return the meal calorie count and add it to the persons calories
	public void eat(Meal consumedMeal){
		this.calories = this.calories + consumedMeal.calculateCalories();
	}
	
	//Takes an int value which represents a minute
	public void walk(int minutesWalked){
		this.calories = this.calories - minutesWalked;
	}
	
	//Simple getter for calories
	public int returnCalorieCount(){
		return this.calories;
	}
	
}