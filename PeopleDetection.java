
public class PeopleDetection implements Sensors {
	public String text;
	
	public PeopleDetection(String text)
	{
		this.text = text;
	}
	
	public void print()
	{
		System.out.println("Sensors used: " + text);
	}


}
