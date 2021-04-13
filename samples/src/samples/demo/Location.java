package samples.demo;
/*public class location
 * 
 * @Thivya
 */
public class Location {
	
	private String name;
	private String city;
	private int poscode;
	private String state;
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}

	public String getCity()
	{
		return city; 
	}
	
	public void setPoscode(int poscode)
	{
		this.poscode=poscode;
	}

	public int getPoscode()
	{
		return poscode;
	}
	
	public void setState(String state)
	{
		this.state=state;
	}

	public String getState()
	{
		return state;
	}
}
