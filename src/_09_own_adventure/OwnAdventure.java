package _09_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	static int coinLevel = 0;
	public static void main(String[] args) {
		int answer = JOptionPane.showOptionDialog(null, "Choose Your Character", "Choose Character", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Knight", "Mage Coming Soon", "Archer Coming Soon" }, null);
		if(answer==(0)) {
			 JOptionPane.showMessageDialog(null,"As you are walking down the path to the next town, a man runs up to you and tells you a thief has robbed him of his money.");
			int quest = JOptionPane.showConfirmDialog(null, "He tells you that if you kill the thief and reclaim the money. He will give you a portion of his earnings. What do you choose?", "Dialogue", JOptionPane.YES_NO_OPTION);
			if (quest==(0)) {
				JOptionPane.showMessageDialog(null, "The man points you to the thiefs camp and you head out.");
				int action = JOptionPane.showOptionDialog(null, "You find the thiefs camp and you draw you weapon while he draws his. You make the first move.", "Fight", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Attack", "Lower Guard", "Defend" }, null);
				if(action==(0)) {
					action();
				}else if(action==1) {
					end();
				}else if (action==2) {
					end();
				}
			}else if(quest==(1)) {
				System.exit(0);
			}
		}else if(answer==(1)) {
			character();
		}else if(answer==(2)) {
			character();
		}
		if(coinLevel >= 100) {
			JOptionPane.showMessageDialog(null, "Quest Complete!");
			System.exit(0);
		}
	}
	static void action() {
		JOptionPane.showMessageDialog(null, "You slayed the thief");
		coinLevel += 100;
	}
	static void end() {
		JOptionPane.showMessageDialog(null, "You died. Game Over.");
		System.exit(0);
	}
	static void character() {
		JOptionPane.showMessageDialog(null, "This Adventurer does not exist");
		System.exit(0);
	}
}
