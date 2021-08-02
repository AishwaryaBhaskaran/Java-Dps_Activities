
public class Wicket {
private String playerName;

Wicket(Bowler b,String playerName)
{
	this.playerName=playerName;
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public void search()
{
	Bowler b;
	if(Players.containsKey(b.getName()))
	{
		System.out.print(+this.playerName);
	}
}
}
