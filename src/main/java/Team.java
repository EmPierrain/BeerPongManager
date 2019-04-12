import java.util.ArrayList;
import java.util.List;

public class Team {
	public static List<Team> teamList = new ArrayList<Team>();
	private String name;
	private List<Player> playerList = new ArrayList<Player>();
	
	public Team() {
		name = "";
		Team.teamList.add(this);
	}
	
	public Team(String name) {
		this.name = name;
		Team.teamList.add(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPlayer(Player player) {
		if (playerList.size()<3) {
			playerList.add(player);
			player.setTeam(this.name);
		}
	}
	
	public List<Player> getPlayers(){
		return playerList;
	}

	public static String teamListing() {
		String line ="<html>";
		for (int index = 0; index < Team.teamList.size(); index++) {
			line += Team.teamList.get(index).getName() + "<br><br>";
		}
		return line;
	}
}
