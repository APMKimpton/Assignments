package year1.term1.assignment4;

public class Exam{
	
	//Fields
	private NumericalQuestion question1;
	private BooleanQuestion question2;
	private MultipleChoiceQuestion question3;
	private int totalMark;
	
	//Constructor
	public Exam(NumericalQuestion question1, BooleanQuestion question2, MultipleChoiceQuestion question3, int totalMark){
		
		//Initialise Variables
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.totalMark = totalMark;
		
	}
	
	//Getters for questions and mark
	public NumericalQuestion question1(){
		return question1;
	}
	
	public BooleanQuestion question2(){
		return question2;
	}
	
	public MultipleChoiceQuestion question3(){
		return question3;
	}
	
	public int totalMark(){
		return totalMark;
	}
	
	//Set total mark
	public void updateTotalMark(int totalMark){
		this.totalMark = this.totalMark + totalMark;
	}
	
	
}