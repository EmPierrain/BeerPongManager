import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	protected void tearDown() throws Exception{
		super.setUp();
	}
	
	public void testNewPlayer() {
		Player player1 = new Player();
		player1.setName("NameOne");
		Player player2 = new Player("NameTwo");
		
		assertEquals(player1.getName(), "NameOne");
		assertEquals(player2.getName(), "NameTwo");
	}	
	
	public void testPlayerTeam() {
		Player player1 = new Player();
		Player player2 = new Player();
		Team team = new Team("TeamName1");
		team.addPlayer(player1);
		player2.setTeam("TeamName2");
		
		assertEquals(team.getName(), player1.getTeam());
		assertEquals("TeamName2", player2.getTeam());
	}	
}
