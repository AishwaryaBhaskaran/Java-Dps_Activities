import java.util.*;
import java.io.*;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> scores13 = new ArrayList<String>(5);
		for(int i=0;i<5;i++)
		{
			String a=s.nextLine();
		    scores13.add(a);
		}
		System.out.print("Enter swap positions:");
		int a=s.nextInt();
		int b=s.nextInt();
		Collections.swap(scores13, a, b);
		String list = Arrays.toString(scores13.toArray()).replace("["," ").replace(",","\n").replace("]"," ");
		System.out.print(list);
		

	}

}
