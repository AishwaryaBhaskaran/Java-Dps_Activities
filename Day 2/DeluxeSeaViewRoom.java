public class DeluxeSeaViewRoom extends DeluxeRoom
{
protected String hotelName;
protected int numberOfSqFeet;
protected Boolean hasTV;
protected Boolean hasWifi;
protected Integer ratePerSqFeet;
public DeluxeSeaViewRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
{
super(hotelName,numberOfSqFeet,hasTV,hasWifi);
ratePerSqFeet=12;
}
public int getRatePerSqFeet()
{
if(hasWifi==true)
return ratePerSqFeet+2;
else
return ratePerSqFeet;
}
}