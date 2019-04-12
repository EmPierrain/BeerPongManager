import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	
	public static void main(String[] args) {
		Team team1 = new Team("Team1");
		Team team2 = new Team("Team2");
		Team team3 = new Team("Team3");
		Team team4 = new Team("Team4");
		
		JFrame frame = new JFrame("My Frame");
		MyWindowListener myWindowListener = new MyWindowListener();
		frame.addWindowListener ( myWindowListener);
		
		JPanel teamPanel = new JPanel(new BorderLayout());

		JLabel teamLabel = new JLabel();
		
		// Building up the first list of Teams
		String teams;
		teams = Team.teamListing();
		System.out.println(teams);
		teamLabel.setText(teams);

		// Building up the panel
		teamPanel.add(teamLabel);
		
		// Building up Main Frame
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize((int) screenSize.getHeight(), (int) screenSize.getWidth()/2);
		frame.add(teamPanel);
		
		frame.setVisible(true);
		
	}
}
