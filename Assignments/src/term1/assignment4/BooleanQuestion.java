package term1.assignment4;

public class BooleanQuestion{
	
	//Fields
	private boolean answer;
	private int mark;
	
	//Constructor
	public BooleanQuestion(boolean answer, int mark){
		
		//Initialise Variables
		this.answer = answer;
		this.mark = mark;
		
	}
	
	//Getters
	public boolean answer(){
		return answer;
	}
	
	public int mark(){
		return mark;
	}
	
	//Set mark	
	public void setMark(int mark){
		this.mark = mark;
	}
}