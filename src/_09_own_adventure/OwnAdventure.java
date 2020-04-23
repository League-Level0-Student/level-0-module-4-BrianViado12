package _09_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	static int coinLevel = 0;
	public static void main(String[] args) {
		int answer = JOptionPane.showOptionDialog(null, "Choose Your Character", "Choose Character", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Knight", "Mage", "Archer" }, null);
		if(answer==(0)) {
			 JOptionPane.showMessageDialog(null,"As you are walking down the path to the next town, a man runs up to you and tells you a thief has robbed him of his money.");
			int quest = JOptionPane.showConfirmDialog(null, "He tells you that if you kill the thief and reclaim the money. He will give you a portion of his earnings. What do you choose?", "Dialogue", JOptionPane.YES_NO_OPTION);
			if (quest==(0)) {
				JOptionPane.showMessageDialog(null, "The man points you the thiefs camp and you head out.");
			}else if(quest==(1)) {
				System.exit(0);
			}
		}else if(answer==(1)) {
			
		}else if(answer==(2)) {
			
		}
		
	}
}
