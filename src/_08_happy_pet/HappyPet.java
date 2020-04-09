package _08_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String answer = JOptionPane.showInputDialog("What pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i = 0; i < 8; i++) {
				
		int task = JOptionPane.showOptionDialog(null, "Do you want to feed pet?", "Food", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Maybe Later", "Don't Feed" }, null);
		int task2 = JOptionPane.showOptionDialog(null, "Your pet wants to chill with you"  , "Food", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Let Them Chill", "Maybe Later", "Push Them Away" }, null);
		int task3 = JOptionPane.showOptionDialog(null, "Your pet wants to sleep in your room tonight ", "Food", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Open the Door", "Maybe Next Time", "Lock the Door" }, null);	
			// 5. Use user input to call the appropriate method created in step 4.
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
				if (happinessLevel==100) {
					JOptionPane.showMessageDialog(null, "You love you're pet");
					System.exit(0);
				}
	}
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	}
	}
	