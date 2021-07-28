import java.util.*;
import java.io.*;
public class InningsMain
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the team name:");
String team=s.nextLine();
System.out.print("Enter session:");
String session=s.nextLine();
System.out.print("Enter runs:");
Integer runs=s.nextInt();
Innings i=new Innings();
i.setTeam(team,session,runs);
i.displayInningsDetails();
}
}

