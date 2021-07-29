import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      HashSet<String> hs=new HashSet<String>();
      for(int i=0;i<n;i++)
      {
    	  String a=s.next();
    	  hs.add(a);
      }
      System.out.print(hs.size());
	}

}
