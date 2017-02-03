package year1.term1.assignment2;

public class Meal{
	
	//Fields
	private Dish starterDish;
	private Dish mainDish;
	private Dish desertDish;
	
	//Constructor
	public Meal(Dish starter, Dish main, Dish desert){
		//Sets the string of the starter to the private field
		this.starterDish = starter;
		
		//Sets the string of the main to the private field
		this.mainDish = main;
		
		//Sets the string of the desert to the private field
		this.desertDish = desert;
	}
	
	//Methods
	
	//Returns the value of calories in the meal
	public int calculateCalories(){
		//Calculates the total calories in the meal by adding the calories in each dish
		int calories = starterDish.getCalories() + mainDish.getCalories() + desertDish.getCalories();
		//returns this variable
		return calories;
	}
	
	
	
}