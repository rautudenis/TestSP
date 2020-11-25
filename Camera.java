import java.util.*;

public class Camera implements Element {
	public String text;
	public List<Sensors> sensorsList = new ArrayList<Sensors>();
	
	public Camera(String text)
	{
		this.text = text;
	}
	
	public void print()
	{
		System.out.println("Camera: " + text);
	}
	
	public void useSensors(Sensors s)
	{
		sensorsList.add(s);
	}

}
