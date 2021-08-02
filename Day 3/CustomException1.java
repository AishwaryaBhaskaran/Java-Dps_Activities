import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CustomException extends Exception
{
 CustomException(String s){
	 super(s);
 }
}
public class CustomException1 {

	public static void main(String[] args) throws Exception {
	
		try {
			String player;
			int Age;
			InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);
		    System.out.println("Enter the player name:");
			player = br.readLine();
			System.out.println("Enter the player age :");
			Age = Integer.parseInt(br.readLine());
			if(Age < 19) {
				throw new CustomException("InvalidAgeRangeException");
			}
			else {
				System.out.println("Player name: "+player);
				System.out.println("Player age: "+Age);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}