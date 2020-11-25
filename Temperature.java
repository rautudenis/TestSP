
public class Temperature implements Element {
public String text;
	
	public Temperature(String text)
	{
		this.text = text;
	}
	
	public void print()
	{
		System.out.println("Camera: " + text);
	}

}
