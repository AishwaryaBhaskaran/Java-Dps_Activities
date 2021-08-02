import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Main m=new Main();
		Player:
		System.out.print("Enter the player name:\n");
		String str=s.next();
		Bowler b=new Bowler();
		b.getName(hm.put(str,b));
		Players.put(str,new Bowler());
		System.out.print("Enter wickets seperated by | symbol:");
		String str1=s.nextLine();
		System.out.print("Do you want to add another player(yes/no)\n");
		Boolean b=s.next()=="yes"?true:false;
		if(b)
		{
			continue Player;
		}
		else
		{
			System.out.print("Enter the player name to search");
			String str2=s.next();
			String[] s3=str.split("\\|");
			for(int i=0;i<s3.length;i++)
			{
				if(s3[i].contains(str2))
				{
					m.search();
				}
			}
		}
		

	}

}
