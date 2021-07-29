import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List4 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	List<Integer> list=new ArrayList<Integer>(n);
	int a;
	for(int i=0;i<n;i++)
	{
		a=s.nextInt();
		list.add(a);	
	}
	System.out.print(list);
	int count=0,count1=0;
	for(int i=0;i<n;i++)
	{
		if(list.get(i)>=50)
		{
			count++;
			System.out.print("count"+count);
		}	
	}
	for(int i=0;i<n;i++)
	{
	if(list.get(i)>=100)
	{
	count1++;
	
	}
	}
	System.out.print(count+"\n");
	System.out.print(count1+"\n");
}
}
