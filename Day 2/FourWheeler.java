public class FourWheeler extends Vehicle
{
private String audioSystem;
private Integer numberOfDoors;
public FourWheeler(String audioSystem,Integer numberOfDoors)
{
super(audioSystem,numberOfDoors);
//this.audioSystem=audioSystem;
//this.numberOfDoors=numberOfDoors;
}
public void displayBasicInfo()
{
System.out.print("--Detail Information--\n");
System.out.print("Audio System:\n");
System.out.print(""+getaudio()+"\n");
System.out.print("Number of Doors:\n");
System.out.print(+getNum()+"\n");
}
}