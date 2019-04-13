import java.awt.BorderLayout;
import javax.swing.ImageIcon;
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
		
		
		// Building the teamPanel
		JPanel teamPanel = new JPanel(new BorderLayout());
		JLabel teamLabel = new JLabel();
		String teams;
		teams = Team.teamListing();
		teamLabel.setText(teams);
		teamPanel.add(teamLabel);
		
		// Building the playerPanel
		JPanel playerPanel = new JPanel(new BorderLayout());
		JLabel playerLabel = new JLabel();
		String players;
		players = Player.playerListing();
		playerLabel.setText(players);
		playerPanel.add(playerLabel);

		// Building the whole Panel
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(teamPanel, BorderLayout.WEST);
		mainPanel.add(playerPanel, BorderLayout.EAST);
		
		// Building Main Frame
		JFrame frame = new JFrame("Beer Pong Manager");
		MyWindowListener myWindowListener = new MyWindowListener();
		frame.setIconImage(new ImageIcon("./icn/beerIcon.png").getImage());
		frame.addWindowListener ( myWindowListener); 
		frame.add(mainPanel);
		frame.pack();
		frame.setVisible(true);
		
	}
}
