import java.util.*;
import java.io.*;

public class TreeSet1 {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Set<String> s1 = new TreeSet<>();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			s1.add(str);
		}
		String list = s1.toString().replace("["," ").replace(",","\n").replace("]"," ");
		System.out.print(list);
	}

}
