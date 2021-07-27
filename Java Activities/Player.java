
import java.util.*;
import java.io.*;
public class Player
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
                String str1=s.nextLine();
		String frst=str.substring(0,1);
		frst=frst.toUpperCase();
		String rem=str.substring(1);
		rem=rem.toLowerCase();
                str1=str1.toUpperCase();
		String s1=frst+rem+" "+str1;
                System.out.print(s1);
	}
}