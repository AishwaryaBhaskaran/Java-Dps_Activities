public class HotelRoom
{
protected String hotelName;
protected int numberOfSqFeet;
protected Boolean hasTV;
protected Boolean hasWifi;
HotelRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi) 
{
this.hotelName=hotelName;
this.numberOfSqFeet=numberOfSqFeet;
this.hasTV=hasTV;
this.hasWifi=hasWifi;
}
public int CalculateTariff(int rate)
{
return numberOfSqFeet*rate;
}
public int getRatePerSqFeet()
{
return 0;
}
}
