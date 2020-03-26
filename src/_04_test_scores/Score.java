package _04_test_scores;

import javax.swing.JOptionPane;

public class Score {
	public static void main(String[] args) {
		String scores = JOptionPane.showInputDialog("What did you get on the test?");
		double score  = Double.parseDouble(scores);
		
		if (score>=91.5) {
			JOptionPane.showMessageDialog(null, "Wow you must've studied really hard.");
		}else if (score>=83.5) {
			JOptionPane.showMessageDialog(null, "Great, but you could do better.");
		}else if (score>=72.5) {
			JOptionPane.showMessageDialog(null, "Better luck next time.");
		}else if (score>=61.5) {
			JOptionPane.showMessageDialog(null, "You should study harder");
		}
	}
}
