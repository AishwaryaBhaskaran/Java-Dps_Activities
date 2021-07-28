public class Vehicle
{
public String make;
public String vehiclenumber;
public Integer fuelTypenum;
public Integer fuelCapacity;
public Integer cc;
private String audioSystem;
private Integer numberOfDoors;
private String kickStartAvailable;
public Vehicle(String make,String vehiclenumber,Integer fuelTypenum,Integer fuelCapacity,Integer cc)
{
this.make=make;
this.vehiclenumber=vehiclenumber;
this.fuelTypenum=fuelTypenum;
this.fuelCapacity=fuelCapacity;
this.cc=cc;
}
public Vehicle(String audioSystem,Integer numberOfDoors)
{
this.audioSystem=audioSystem;
this.numberOfDoors=numberOfDoors;
}
public Vehicle(String kickStartAvailable)
{
this.kickStartAvailable=kickStartAvailable;
}
public void displaymake()
{
System.out.print("**"+make+"**\n");
}
public String getaudio()
{
return audioSystem;
}
public Integer getNum()
{
return numberOfDoors;
}
public String getKickstart()
{
return kickStartAvailable;
}
public void displayBasicInfo()
{
String fuelType=" ";
if(fuelTypenum==1)
{
fuelType="Petrol";
}
if(fuelTypenum==2)
{
fuelType="Deisel";
}
System.out.print("--Basic Information--\n");
System.out.print("Vehicle Number:"+vehiclenumber+"\n");
System.out.print("Fuel Capacity:"+fuelCapacity+"\n");
System.out.print("Fuel Type:"+fuelType+"\n");
System.out.print("CC:"+cc+"\n");
}
public void displayDetailInfo()
{
System.out.print(" ");
}
}
