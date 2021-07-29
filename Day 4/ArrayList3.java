import java.util.*;
import java.io.*;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the top 5 scorers of IPL Season 13\n");
		ArrayList<String> scores13 = new ArrayList<String>(5);
		for(int i=0;i<5;i++)
		{
			String a=s.nextLine();
		    scores13.add(a);
		}
		ArrayList<String> scores15 = new ArrayList<String>(5);
		
		
		System.out.print("Enter the top 5 scorers of IPL Season 15\n");
		for(int i=0;i<5;i++)
		{
			String a=s.nextLine();
		    scores15.add(a);
		}
		
		
		
		scores13.retainAll(scores15);
		String list = Arrays.toString(scores13.toArray()).replace("["," ").replace(",","\n").replace("]"," ");
		System.out.print("Consistent run scorers\n");
		System.out.print(list);
		
         

	}

}
