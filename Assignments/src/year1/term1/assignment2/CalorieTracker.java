package year1.term1.assignment2;

public class CalorieTracker{
	
	public static void main(String[] args){
		
		
		//Creats a object of the Person class called Fred
		Person fred = new Person();
		System.out.println("Fred has consumed " + fred.returnCalorieCount() + " calories!");
		
		//Meal with the lowest calorie count was the Omelette Breakfast
		//Create the 3 dishes for my meal
		Dish toastStarter = new Dish(110);
		Dish omeletteMain = new Dish(425);
		Dish bananaDesert = new Dish(140);
		
		//Applies the dishes to the meal object via a constructor method
		Meal omeletteBreakfast = new Meal(toastStarter, omeletteMain, bananaDesert);				
		
		//Make the person consume the omlette breakfast
		fred.eat(omeletteBreakfast);
		System.out.println("The Omelette Breakfast has a total calorie count of " + omeletteBreakfast.calculateCalories());
		System.out.println("Fred ate the Omelette Breakfast and has a total calorie count of " + fred.returnCalorieCount());
		
		//Meal with the 1000 calorie count was the Pizza Dinner
		//Create 3 dishes for my meal
		Dish potatoWedgesStarter = new Dish(210);
		Dish pizzaMain = new Dish(455);
		Dish cheesecakeDesert = new Dish(335);
		//applies the dishes to the meal object via a constructor method
		Meal pizzaDinner = new Meal(potatoWedgesStarter, pizzaMain, cheesecakeDesert);
		
		//Make the person consume the Pizza Dinner
		fred.eat(pizzaDinner);
		System.out.println("The Pizza Dinner has a total calorie count of " + pizzaDinner.calculateCalories());
		System.out.println("Fred ate the Pizza Dinner and has a total calorie count of " + fred.returnCalorieCount());
		
		//Meal with the Highest calorie count was the Pie Lunch
		//Create 3 new dishes for my meal
		Dish potatoGratinStarter = new Dish(250);
		Dish pieMain = new Dish(600);
		Dish gelatoDessert = new Dish(305);
		//applies the dishes to the meal object via a constructor method
		Meal pieLunch = new Meal(potatoGratinStarter, pieMain, gelatoDessert);
	
		//Make the person consume the Pie Lunch
		fred.eat(pieLunch);
		System.out.println("The Pie Lunch has a total calorie count of " + pieLunch.calculateCalories());
		System.out.println("Fred ate the Pie Lunch and has a total calorie count of " + fred.returnCalorieCount());
		
		//Make the person walk until they have a total calorie count of 2000
		fred.walk(830);
		System.out.println("Fred had to walk for 830 minutes, which is 13 hours and 50 minutes, to get his calorie count down to 2000");
		
		
	}
	
}