
public class RoadDetection implements Sensors {
	public String text;
	
	public RoadDetection(String text)
	{
		this.text = text;
	}
	
	public void print()
	{
		System.out.println("Sensors used: " + text);
	}

}
