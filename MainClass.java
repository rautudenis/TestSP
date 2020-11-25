
public class MainClass {
	public static void main(String[] args)
	{
		DataModel d1 = new DataModel("DataModel1");
		Proximity p1 = new Proximity("Proximity");
		Lidar l1 = new Lidar("Lidar");
		Camera c1 = new Camera("Camera");
		Temperature t1 = new Temperature("Temperature");
		
		d1.addContent(p1);
		d1.addContent(l1);
		d1.addContent(c1);
		d1.addContent(t1);
		
		d1.print();
		
		RoadDetection rd1 = new RoadDetection("RoadDetection");
		
		c1.useSensors(rd1);
		
		rd1.print();
		
	}
}
