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
		
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		Player player3 = new Player("Player3");
		Player player4 = new Player("Player4");

		
		JFrame frame = new JFrame("My Frame");
		MyWindowListener myWindowListener = new MyWindowListener();
		frame.addWindowListener ( myWindowListener);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel teamPanel = new JPanel(new BorderLayout());
		JPanel playerPanel = new JPanel(new BorderLayout());

		JLabel teamLabel = new JLabel();
		
		// Building up the list of Teams
		String teams;
		teams = Team.teamListing();
		teamLabel.setText(teams);
		
		JLabel playerLabel = new JLabel();
		String players;
		players = Player.playerListing();
		playerLabel.setText(players);

		// Building up the panel
		teamPanel.add(teamLabel);
		
		playerPanel.add(playerLabel);
		
		mainPanel.add(teamPanel, BorderLayout.WEST);
		mainPanel.add(playerPanel, BorderLayout.EAST);
		
		// Building up Main Frame
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize((int) screenSize.getHeight(), (int) screenSize.getWidth()/2);
		frame.add(mainPanel);
		
		frame.setVisible(true);
		
	}
}
