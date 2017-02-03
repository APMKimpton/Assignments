package term1.assignment4;

public class MultipleChoiceQuestion{
	
	//Fields
	private boolean option1;
	private boolean option2;
	private boolean option3;
	private int mark;
	
	//Constructor
	public MultipleChoiceQuestion(boolean option1, boolean option2, boolean option3, int mark){
		
		//Initialise Variables
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.mark = mark;
	}
	
	
	//Getters for each option
	public boolean option1Answer(){
		return option1;
	}
	
	public boolean option2Answer(){
		return option2;
	}
	
	public boolean option3Answer(){
		return option3;
	}
	
	//Updates the mark instead of replacing it
	public void updateMark(int mark){
		this.mark = this.mark + mark;
	}
	
	//Getter for the mark
	public int mark(){
		return mark;
	}
}