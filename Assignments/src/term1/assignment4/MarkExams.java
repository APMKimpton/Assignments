package term1.assignment4;

public class MarkExams{
	
	//Main method
	public static void main(String[] args){
		
		//Create Question 1 for mark scheme
		NumericalQuestion nqMarkScheme = new NumericalQuestion(120369, 11);
		
		//Create Question 2 for mark scheme
		BooleanQuestion bqMarkScheme = new BooleanQuestion(true, 1);
		
		//Create Question 3 for mark scheme
		MultipleChoiceQuestion mcqMarkScheme = new MultipleChoiceQuestion(true, false, false, 3);
		
		//Binds the questions to a markscheme
		Exam markScheme = new Exam(nqMarkScheme, bqMarkScheme, mcqMarkScheme, 15);		
		
		//****************************************************************************************\\		
		
		//Create Question 1 attempt
		NumericalQuestion nqAttempt = new NumericalQuestion(120368, 0);
		
		//Create Question 2 attempt
		BooleanQuestion bqAttempt = new BooleanQuestion(false, 0);
		
		//Create Question 3 attempt
		MultipleChoiceQuestion mcqAttempt = new MultipleChoiceQuestion(false, true, true, 0);
		
		//Binds attempts to an exam
		Exam examAttempt = new Exam(nqAttempt, bqAttempt, mcqAttempt, 0);
		
		//****************************************************************************************\\
		
		//Create a marker
		Marker examMarker = new Marker();
		
		//Mark exams
		examMarker.markAttempt(examAttempt, markScheme);
		
		//****************************************************************************************\\
		
		//Creates a local variable to hold the classification based on the boundary constraints
		double classification = examMarker.convertMarksToClassification(examAttempt.totalMark(), 13, 11, 8);
		
		//Prints the classification
		System.out.println("This exam scored a " + classification + " classification");
		
	}
}