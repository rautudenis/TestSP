
public class SignDetection implements Sensors {
	public String text;
	
	public SignDetection(String text)
	{
		this.text = text;
	}
	
	public void print()
	{
		System.out.println("Sensors used: " + text);
	}

}
