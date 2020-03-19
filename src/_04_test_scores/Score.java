package _04_test_scores;

import javax.swing.JOptionPane;

public class Score {
	public static void main(String[] args) {
		String scores = JOptionPane.showInputDialog("What did you get on the test?");
		double C = Integer.parseInt(scores)* 75.5;
		double A = Integer.parseInt(scores)* 91.5;
		double D = Integer.parseInt(scores)* 64.5;
		double B = Integer.parseInt(scores)* 83.5;
		if (scores==("C")) {
			
		}
	}
}
