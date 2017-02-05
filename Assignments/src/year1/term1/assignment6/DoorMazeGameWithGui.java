package year1.term1.assignment6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class DoorMazeGameWithGui{
	
	private static String name;
	
	
	
	//Main Method
	
	public static void main(String[] args){
				
		//Create a monster room
		Room monsterRoom = new Room(true, "The Monster Room");
		
		//Create the Final Room
		Room room6 = new Room("The Great Hall", true);
		
		//Creates all the main rooms
		Room room5 = new Room("The Fifth Hall", room6, monsterRoom);
		Room room4 = new Room("The Fourth Hall", monsterRoom, room5);
		Room room3 = new Room("The Third Hall", room4, monsterRoom);
		Room room2 = new Room("The Second Hall", room3, monsterRoom);
		Room room1 = new Room("The First Hall", monsterRoom, room2);
		
		//Creates a player
		Player player = new Player(2, room1);
			
		//Call the first window
		nameWindow();	
		
	}
	
	public static void nameWindow(){
		
		JFrame window = new JFrame("Door Maze Game");
		window.setSize(300,200);
		
		setupWindow(window);
			
		window.setLayout(new BorderLayout());
		JPanel jpNorth = new JPanel();
		JPanel jpCenter = new JPanel();		
		JPanel jpSouth = new JPanel();
		
		window.add(jpNorth, BorderLayout.NORTH);
		window.add(jpCenter, BorderLayout.CENTER);
		window.add(jpSouth, BorderLayout.SOUTH);
		
		jpCenter.setLayout(new GridLayout(1, 2));
		jpNorth.setLayout(new GridLayout(8, 1));
		
		//Page 1: Enter name
		JLabel jlWelcomeMessage = new JLabel("Welcome to the Door Maze Game!");
		jlWelcomeMessage.setHorizontalAlignment(JLabel.CENTER);
		JLabel jlRules = new JLabel("Rules:");
		JLabel jlRule1 = new JLabel("You will be presented with 2 doors, a blue one and a red one.");
		JLabel jlRule2 = new JLabel("You must select a door, one will allow you to progress, while the other unleases a monster.");
		JLabel jlRule3 = new JLabel("If you are attacked by a monster, you will lose a life. You only have 2, so be careful!");
		JLabel jlRule4 = new JLabel("If you select a valid door, you will progress to the next set, until you reach the final door.");
		JLabel jlRule5 = new JLabel("If you make it to the final door, you have won! Good luck!");
		
		JLabel jlName = new JLabel("Name:");
		JTextField jtfName = new JTextField("John Smith");
		JButton jbOk = new JButton("Continue");
		
		jpNorth.add(jlWelcomeMessage);
		jpNorth.add(jlRules);
		jpNorth.add(jlRule1);
		jpNorth.add(jlRule2);
		jpNorth.add(jlRule3);
		jpNorth.add(jlRule4);
		jpNorth.add(jlRule5);
		jpCenter.add(jlName); jpCenter.add(jtfName);
		jpSouth.add(jbOk);
		
		window.pack();
		
		jbOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				name = jtfName.getText();
				
				window.dispose();
				
				System.out.println(name);
				
				window.setVisible(true);
				
			}
			
		});
		
		
		window.setVisible(true);
	}
	
}