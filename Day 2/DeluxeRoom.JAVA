public class DeluxeRoom extends HotelRoom
{
protected String hotelName;
protected int numberOfSqFeet;
protected Boolean hasTV;
protected Boolean hasWifi;
protected Integer ratePerSqFeet;
public DeluxeRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
{
super(hotelName,numberOfSqFeet,hasTV,hasWifi);
ratePerSqFeet=10;
}
public int getRatePerSqFeet()
{
if(hasWifi==true)
return ratePerSqFeet+2;
else
return ratePerSqFeet;
}
}