public class Innings
{
private String team;
private String session;
private int runs;
public void setTeam(String team,String session,Integer runs)
{
this.team=team;
this.session=session;
this.runs=runs;
}
public void displayInningsDetails()
{
System.out.print("Name:"+this.team);
System.out.println(" ");
System.out.print("Scored:"+this.runs);
}
}
