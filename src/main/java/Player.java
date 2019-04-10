import java.util.ArrayList;
import java.util.List;

public class Player {
	public static List<Player> playerList = new ArrayList<Player>();
	private String team;
	public String name;
	
	public Player() {
		name = "";
		team = "";
		Player.playerList.add(this);
	}
	
	public Player(String name) {
		this.name = name;
		team = "";
		Player.playerList.add(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTeam(String name) {
		this.team = name;
	}
	
	public String getTeam() {
		return team;
	}
}
