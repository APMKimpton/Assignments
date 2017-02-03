package term1.assignment4;

public class Marker{

	//Methods
	
	//Mark attempt
	public void markAttempt(Exam examAttempt, Exam markScheme){
		
		//Algorithms to update the marks and total marks of the questions and exam respectively
		
		//Question 1
		if(examAttempt.question1().answer() == markScheme.question1().answer()){
			
			//If the answer exactly matches
			examAttempt.question1().setMark(markScheme.question1().mark());
			examAttempt.updateTotalMark(markScheme.question1().mark());
			
		} else if(examAttempt.question1().answer() == (markScheme.question1().answer() - 1) || examAttempt.question1().answer() == (markScheme.question1().answer() + 1)){
			
			//If the answer is 1 value off
			examAttempt.question1().setMark(markScheme.question1().mark() - 1);
			examAttempt.updateTotalMark(markScheme.question1().mark() - 1);
			
		} else if(examAttempt.question1().answer() >= (markScheme.question1().answer() -5) && examAttempt.question1().answer() <= (markScheme.question1().answer() + 5)) {
			
			//If the answer they gave is within 5 units off, award 1 mark
			examAttempt.question1().setMark(1);
			examAttempt.updateTotalMark(1);
			
		} else {
			
			//Award 0 marks
			examAttempt.question1().setMark(0);
			examAttempt.updateTotalMark(0);
			
		}
		
		//Prints the mark achieved in q1
		System.out.println("Question 1: " + examAttempt.question1().mark() + " out of " + markScheme.question1().mark());
		
		//Question 2
		if(examAttempt.question2().answer() == markScheme.question2().answer()){
			
			//If the answers matches
			examAttempt.question2().setMark(markScheme.question2().mark());
			examAttempt.updateTotalMark(markScheme.question2().mark());
			
		} else {
			
			//If the answer is wrong - This else clause doesn't have to exist - Just here for readability 
			examAttempt.question2().setMark(0);
			examAttempt.updateTotalMark(0);
			
		}
		
		//Prints the marks achieved in q2
		System.out.println("Question 2: " + examAttempt.question2().mark() + " out of " + markScheme.question2().mark());
		
		//Question 3
		//Option1
		if(examAttempt.question3().option1Answer() == markScheme.question3().option1Answer()){
			
			//If they got the first option right
			examAttempt.question3().updateMark(1);
			examAttempt.updateTotalMark(1);
			
		}
		
		//Option2
		if(examAttempt.question3().option2Answer() == markScheme.question3().option2Answer()){
			
			//If they got the second option right
			examAttempt.question3().updateMark(1);
			examAttempt.updateTotalMark(1);
			
		}
		
		//Option3
		if(examAttempt.question3().option3Answer() == markScheme.question3().option3Answer()){
			
			//If they got the second option right
			examAttempt.question3().updateMark(1);
			examAttempt.updateTotalMark(1);
			
		}
		
		//Prints the marks achieved in q3
		System.out.println("Question 3: " + examAttempt.question3().mark() + " out of " + markScheme.question3().mark());
		
		//Prints the total marks achieved in the exam
		System.out.println("Total Marks: " + examAttempt.totalMark() + " out of " + markScheme.totalMark());
	
	}
	
	public double convertMarksToClassification(int mark, int firstBoundary, int upperSecondBoundary, int lowerSecondBoundary){
		
		//Local Variable
		double classification;
		
		
		//Compare mark to the boundary's, sets the classification accordingly
		if(mark >= firstBoundary){
			classification = 1.1;			
		} else if(mark >= upperSecondBoundary){
			classification = 2.1;
		} else if(mark >= lowerSecondBoundary){
			classification = 2.2;
		} else {
			classification = 0.0;
		}
		
		//Returns the classification
		return classification;
		
	}
}

































