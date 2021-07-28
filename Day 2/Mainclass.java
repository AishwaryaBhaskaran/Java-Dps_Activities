import java.util.*;
import java.io.*;
public class Mainclass
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("1.Four Wheeler\n");
System.out.print("2.Two Wheeler\n");
System.out.print("Enter Vehicle Type:\n");
//FourWheeler f=new FourWheeler();
int choice=s.nextInt();
if(choice==1)
{
System.out.print("Vehicle Make:\n");
String make=s.next();
System.out.print("Enter Vehicle Number:\n");
String vehiclenumber=s.next();
System.out.print("Fuel Type:\n");
System.out.print("1.Petrol\n");
System.out.print("2.Diesel\n");
Integer fuelTypenum=s.nextInt();
System.out.print("FuelCapacity:\n");
Integer fuelCapacity=s.nextInt();
System.out.print("Engine CC:");
Integer cc=s.nextInt();
System.out.print("Audio System:\n");
String audioSystem=s.next();
System.out.print("Number of Doors:\n");
Integer numberOfDoors=s.nextInt();
Vehicle v=new Vehicle(make,vehiclenumber,fuelTypenum,fuelCapacity,cc);
v.displaymake();
v.displayBasicInfo();
Vehicle f=new FourWheeler(audioSystem,numberOfDoors);
f.displayBasicInfo();
}
if(choice==2)
{
System.out.print("Vehicle Make:\n");
String make=s.next();
System.out.print("Enter Vehicle Number:\n");
String vehiclenumber=s.next();
System.out.print("Fuel Type:\n");
System.out.print("1.Petrol\n");
System.out.print("2.Diesel\n");
Integer fuelTypenum=s.nextInt();
System.out.print("FuelCapacity:\n");
Integer fuelCapacity=s.nextInt();
System.out.print("Engine CC:");
Integer cc=s.nextInt();
System.out.print("Kick Start Available(yes/no):\n");
String ks=s.next();
Vehicle v=new Vehicle(make,vehiclenumber,fuelTypenum,fuelCapacity,cc);
v.displaymake();
v.displayBasicInfo();
Vehicle t=new TwoWheeler(ks);
t.displayBasicInfo();
}
}
}

