package term1.assignment5;

public class Coordinates{
	
	//Fields
	private int x;
	private int y;
	
	//Constructor
	public Coordinates(int x, int y){
		
		//Initialise Variables
		this.x = x;
		this.y = y;
		
	}
	
	//Getter methods	
	public int x(){
		return x;
	}
	
	public int y(){
		return y;
	}
	
	//Setter methods
	public void updateX(int x){
		this.x = this.x + x;
	}
	
	public void updateY(int y){
		this.y = this.y + y;
	}
	
}