import java.util.ArrayList;
import java.util.List;

public class Team {
	public static List<Team> teamList = new ArrayList<Team>();
	
	private String name; // Name of the team
	private List<Player> playerList = new ArrayList<Player>(); // List of the players in the team
	
	public Team() {
		// Default constructor
		name = "";
		Team.teamList.add(this);
	}
	
	public Team(String name) {
		// Constructor with the team name
		this.name = name;
		Team.teamList.add(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Player> getPlayers(){
		// Return the players in the team
		return playerList;
	}
	
	public boolean addPlayer(Player player) {
		// Adding a player. Can't add more than 3
		// Return true if the player has been added
		boolean added = false;
		if (playerList.size()<3) {
			playerList.add(player);
			player.setTeam(this.name);
			added = true;
		}
		return added;
	}

}
