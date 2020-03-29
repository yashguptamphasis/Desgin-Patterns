package Factory;

public class Test {
	public static void main(String args[])
	{
		BatteryFactory bf= new BatteryFactory();
		
//		Battery b=bf.getBattery("samsung");
//		b.batteryName();
		
		Battery b1=bf.getBattery("sony");
		b1.batteryName();
	}
}
