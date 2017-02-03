package year1.term1.assignment4;

public class NumericalQuestion{
	
	//Fields
	private int answer;
	private int mark;
	
	//Constructor
	public NumericalQuestion(int answer, int mark){
		
		//Initialise variables
		this.answer = answer;
		this.mark = mark;
		
	}
	
	//Getters for fields
	public int answer(){
		return answer;
	}
	
	public int mark(){
		return mark;
	}
	
	//Set the mark
	public void setMark(int mark){
		this.mark = mark;
	}
}