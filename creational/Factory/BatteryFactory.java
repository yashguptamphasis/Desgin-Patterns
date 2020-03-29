package Factory;

public class BatteryFactory {

	Battery getBattery(String s)
	{
		if(s==null)
		{
			return null;
		}
		else if(s.equals("sony"))
		{
			new Sony();
		}
		else if(s.equals("samsung"))
		{
			new Samsung();
		}
		
		return null;
		
	}
}
