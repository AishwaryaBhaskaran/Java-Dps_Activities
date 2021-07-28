public class SuiteRoom extends HotelRoom
{
private int ratePerSqFeet;
public SuiteRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
{
super(hotelName,numberOfSqFeet,hasTV,hasWifi);
this.ratePerSqFeet=15;
}
public int getRatePerSqFeet()
{
if(hasWifi==true)
return ratePerSqFeet+2;
else
return ratePerSqFeet;
}
}