package year1.term1.assignment1;

/*
Programmer: Antony Kimpton
Date Created: 07/10/2016 - Lab Session
Task: Assignment 1
*/

public class MessagePrinter{
	
	public static void main(String[] args) {
		
	//Make an instance of the Message class
	Messages messagesInstance = new Messages();
	
	//Calls the fuction that prints my name
	messagesInstance.namePrinter();
	
	//Calls the function that prints the name 'Charlie'
	messagesInstance.wordPrinter();
	
	//Prints the 'value +1' of the value I provide
	messagesInstance.incrementPrinter(21);
	
	}
	
	
	
	
}