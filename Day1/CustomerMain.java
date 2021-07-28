import java.util.*;
import java.io.*;
public class CustomerMain
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the details:");
String name=s.nextLine();
String address=s.nextLine();
String mobile=s.nextLine();
Customer c=new Customer();
c.setValues(name,address,mobile);
c.displayDetails();
}
}