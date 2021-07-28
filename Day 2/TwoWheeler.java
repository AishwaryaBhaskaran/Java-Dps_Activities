public class TwoWheeler extends Vehicle
{
private String audioSystem;
private Integer numberOfDoors;
private String kickStartAvailable;
public TwoWheeler(String kickStartAvailable)
{
super(kickStartAvailable);
//this.audioSystem=audioSystem;
//this.numberOfDoors=numberOfDoors;
}
public void displayBasicInfo()
{
System.out.print("--Detail Information--\n");
System.out.print("Kick Start Available:"+getKickstart().toUpperCase()+" ");
}
}