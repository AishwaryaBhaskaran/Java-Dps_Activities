import java.util.*;
import java.io.*;
import java.lang.*;
public class Password
{
	public int sumPrimeArray(int array[],int size)
	{
		int m=0,flag=0;  
		int sum=0;
		for(int i=0;i<size;i++)
		{ 
			flag=0;
			m=array[i]/2;     
			if(array[i]==0||array[i]==1)
			{  
				flag=1;    

			}
			else
			{  
				for(int j=2;j<=m;j++)
				{      
					if(array[i]%j==0)
					{      

						flag=1;      
						break;      
					}
				}         
				if(flag==0)  
				{
					sum=sum+array[i];
				}  
			}
			//System.out.print(sum); 
		}
		return sum;
	}
	public static void main(String args[])
	{
		Password p=new Password();
		Scanner s=new Scanner(System.in);
		int size=0;
        size=s.nextInt();
        if(size<0)
        {
        	System.out.print("Invalid array size");
        }
        int array[]=new int[size];
		for(int i=0;i<size;i++)
		{

			array[i]=s.nextInt();
			if(array[i]<0)
			{
				System.out.print("Invalid array Input");
				break;
			}
		}

		int a=p.sumPrimeArray(array,size);

		System.out.print(a);
	}
}
