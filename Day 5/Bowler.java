import java.util.HashMap;

public class Bowler {
	private String Name;
	private HashMap<String,Object> hm=new HashMap<String,Object>();
    Bowler()
    {
    	
    }
	Bowler(String Name)
	{
		this.Name=Name;
	}

	public HashMap<String, Object> getName() {
		hm.put(Name,new Bowler());
		return hm;
	}

	public void setName(HashMap<String,Object> hm) {
		this.hm=hm;
	}
	public void Playerdetails()
	{
	    System.out.print(" "+this.getName());
		
	}
	

}
