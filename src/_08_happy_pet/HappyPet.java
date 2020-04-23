package _08_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String answer = JOptionPane.showInputDialog("What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 10; i++) {

			int task = JOptionPane.showOptionDialog(null, "Do you want to feed pet?", "Food", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Feed", "Maybe Later", "Don't Feed" }, null);
			if (task == (0)) {
				feed();
			} else if (task == (1)) {
				sad();
			} else if (task == (2)) {
				sad();
			}

			int task2 = JOptionPane.showOptionDialog(null, "Your pet wants to chill with you", "Food", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Let Them Chill", "Maybe Later", "Push Them Away" }, null);
			if (task2 == (0)) {
				happy();
			} else if (task2 == (1)) {
				sad();
			} else if (task2 == (2)) {
				sad();
			}
			int task3 = JOptionPane.showOptionDialog(null, "Your pet wants to sleep in your room tonight ", "Food", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Open the Door", "Maybe Next Time", "Lock the Door" }, null);
			if (task3 == (0)) {
				happy();
			} else if (task3 == (1)) {
				sad();
			} else if (task3 == (2)) {
				sad();
			}
			int task4 = JOptionPane.showOptionDialog(null, "Your pet wants to eat some chocolate", "Food", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give Chocolate", "Maybe Next Time", "Don't Give Chocolate" }, null);
			if (task4 == (0)) {
				poison();
			} else if (task4 == (1)) {
				sad();
			} else if (task4 == (2)) {
				sad();
			}
			int task5 = JOptionPane.showOptionDialog(null, "Your pet made a mess while you were gone", "Food", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give Treat", "Train Not To Do That", "Punish" }, null);
			if (task5 == (0)) {
				happy();
			} else if (task5 == (1)) {
				sad();
			} else if (task5 == (2)) {
				sad();
			}
			int task6 = JOptionPane.showOptionDialog(null, "Your pet wants to get out of the house", "Food", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go Out With Them", "Maybe Later", "Social Distancing" }, null);
			if (task6 == (0)) {
				happy();
			} else if (task6 == (1)) {
				sad();
			} else if (task6 == (2)) {
				sad();
			}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 100) {
				JOptionPane.showMessageDialog(null, "You love you're pet");
				System.exit(0);
			}
		}

		// 4. Create methods to handle each of your user selections.
		// Each method should create a pop-up with the pet's response (eg. cat might
		// purr when pet),
		// and INCREMENT the pet's happiness Level.

	}

	static void feed() {
		JOptionPane.showMessageDialog(null, "Your pet made a happy sound and is full ");
		happinessLevel += 10;
	}

	static void sad() {
		JOptionPane.showMessageDialog(null, "Your pet made whimper");
		happinessLevel -= 10;
	}

	static void happy() {
		JOptionPane.showMessageDialog(null, "Your pet made a happy sound");
		happinessLevel += 10;
	}

	static void poison() {
		JOptionPane.showMessageDialog(null, "Your pet contracted food poisoning");
		happinessLevel -= 10;
	}
}
