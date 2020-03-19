package _03_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
			String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
			double nickel = Integer.parseInt(nickels)*.05;
		// Ask the user how many dimes they have, and convert their answer
			String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
			 double dime = Integer.parseInt(dimes)*.10;
		// Ask the user how many quarters they have, and convert their answer
			String quarters = JOptionPane.showInputDialog("How many quarters do you have");
			double quarter = Integer.parseInt(quarters)*0.25;
		// Calculate how much money the user has and save it in a double variable 
			
			double total= nickel+dime+quarter;
			
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You're total is " +total );
	}
}

