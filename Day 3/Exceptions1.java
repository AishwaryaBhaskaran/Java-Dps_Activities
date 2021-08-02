import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exceptions1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		int runs=0;
		int overs=0;
		float runrate;
		try
		{
		System.out.print("Enter the total runs scored\n");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		runs=Integer.parseInt(reader.readLine());
		System.out.print("Enter the total overs faced\n");
		overs=Integer.parseInt(reader.readLine());
		if(overs==0)
		{
			throw new ArithmeticException();
		}
		runrate=runs/overs;
		System.out.print("Current Run Rate:"+runrate);
		}
		catch(ArithmeticException|NumberFormatException e)
		{
	        System.out.println(((Throwable) e).toString());
		}
		}
		

	}


