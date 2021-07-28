import java.util.*;
import java.io.*;
public class MainClass1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Hotel Tariff Calculator\n");
System.out.print("1.Deluxe Room\n");
System.out.print("2.Deluxe AC Room\n");
System.out.print("3.Suite AC Room\n");
System.out.print("Select Room Type:\n");
int a=s.nextInt();
if(a==1)
{
System.out.print("Hotel Name:\n");
String hotel=s.next();
System.out.print("Room Square Feet Area:\n");
int ft=s.nextInt();
System.out.print("Room has TV(yes/no):");
Boolean room=(s.next().equals("yes"))?true:false;;
System.out.print("Room has Wifi(yes/no):");
Boolean wifi=(s.next().equals("yes"))?true:false;;
DeluxeRoom d=new DeluxeRoom(hotel,ft,room,wifi);
int rate=d.getRatePerSqFeet();
System.out.print("Room Tariff Per day is:"+d.CalculateTariff(rate));
}
else if(a==2)
{
System.out.print("Hotel Name:\n");
String hotel=s.next();
System.out.print("Room Square Feet Area:\n");
int ft=s.nextInt();
System.out.print("Room has TV(yes/no):");
Boolean room=(s.next().equals("yes"))?true:false;;
System.out.print("Room has Wifi(yes/no):");
Boolean wifi=(s.next().equals("yes"))?true:false;;
DeluxeSeaViewRoom de=new DeluxeSeaViewRoom(hotel,ft,room,wifi);
int rate=de.getRatePerSqFeet();
System.out.print("Room Tariff Per day is:"+de.CalculateTariff(rate));
}
else
{
System.out.print("Hotel Name:\n");
String hotel=s.next();
System.out.print("Room Square Feet Area:\n");
int ft=s.nextInt();
System.out.print("Room has TV(yes/no):");
Boolean room=(s.next().equals("yes"))?true:false;;
System.out.print("Room has Wifi(yes/no):");
Boolean wifi=(s.next().equals("yes"))?true:false;;
SuiteRoom sc=new SuiteRoom(hotel,ft,room,wifi);
int rate=sc.getRatePerSqFeet();
System.out.print("Room Tariff Per day is:"+sc.CalculateTariff(rate));
}
}
}
