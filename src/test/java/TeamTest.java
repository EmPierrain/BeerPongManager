import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class TeamTest extends TestCase {
	
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	protected void tearDown() throws Exception{
		super.setUp();
	}
	
	public void testNewTeam() {
		// Testing basic functions
		Team team1 = new Team();
		team1.setName("NameOne");
		Team team2 = new Team("NameTwo");
		
		assertEquals(team1.getName(), "NameOne");
		assertEquals(team2.getName(), "NameTwo");
	}
	
	public void testAddingPlayer() {
		// Testing adding players to a team
		Team team = new Team();
		Player player1 = new Player();
		Player player2 = new Player();
		List<Player> playerList= new ArrayList<Player>();
		playerList.add(player1);
		playerList.add(player2);
		team.addPlayer(player1);
		team.addPlayer(player2);
		
		assertEquals(playerList, team.getPlayers());		
	}
	
	public void testAddingMoreThanThree() {
		// A Team can't contain more than 3 players
		Team team = new Team();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		team.addPlayer(player1);
		team.addPlayer(player2);
		team.addPlayer(player3);
		team.addPlayer(player4);

		assertEquals(3, team.getPlayers().size());
	}
	
}
