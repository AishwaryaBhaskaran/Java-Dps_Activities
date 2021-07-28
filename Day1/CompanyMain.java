import java.util.*;
public class CompanyMain
{
public static void main(String args[])
{
Company m=new Company();
Scanner s=new Scanner(System.in);
System.out.print("Enter the company name:");
String name=s.nextLine();
m.setName(name);
System.out.print("Enter the employees:");
String emp=s.nextLine();
m.setEmployees(emp);
System.out.print("Enter TeamLead:");
String teamlead=s.nextLine();
m.setTeamLead(teamlead);
m.displayDetails();
}
}

