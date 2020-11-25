
public class Lidar implements Element {
public String text;
	
	public Lidar(String text)
	{
		this.text = text;
	}
	
	public void print()
	{
		System.out.println("Lidar: " + text);
	}

}
