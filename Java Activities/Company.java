import java.util.*;
public class Company
{
public String name;
public String emp;
public String teamlead;
public void setName(String name)
{
this.name=name;
}
public String getName(String name)
{
return name;
}
public void setEmployees(String emp)
{
this.emp=emp;
}
public String getEmployees(String emp)
{
return emp;
}
public void setTeamLead(String teamlead)
{
this.teamlead=teamlead;
}
public String getTeamLead(String teamlead)
{
return teamlead;
}
public void displayDetails()
{
System.out.print("Name:"+this.name);
System.out.println(" ");
System.out.print("Employees:"+this.emp);
System.out.println(" ");
System.out.println("Lead:"+this.teamlead);
}
}