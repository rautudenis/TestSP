import java.util.*;

public class DataModel implements Element {
	public String name;
	public List<Element> dataModels = new ArrayList<Element>();
	
	public DataModel(String name)
	{
		this.name = name;
	}
	
	public void addContent(Element el)
	{
		dataModels.add(el);
	}
	
	public void print()
	{
		System.out.println("Data models name: " + name + " and sensors or panels: ");
		
		for(Element i : dataModels)
		{
			i.print();
		}
	}
}
