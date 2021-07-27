public class Customer
{
private String name;
private String address;
private String mobile;
public void setValues(String name,String address,String mobile)
{
this.name=name;
this.address=address;
this.mobile=mobile;
}
public void displayDetails()
{
System.out.print("Name:"+this.name);
System.out.println(" ");
System.out.print("Address:"+this.address);
System.out.println(" ");
System.out.print("Mobile:"+this.mobile);
}
}