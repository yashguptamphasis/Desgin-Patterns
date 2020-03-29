package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	
	private static List<String> bs= new ArrayList<String>();
	private Internet inter= new RealInternet();
	static {
		bs.add("abc");
		bs.add("efg");
		bs.add("xyz");
	}
	
	@Override
	public void toConnect(String serverName) throws Exception {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0;i<bs.size();i++)
		{
			if(serverName.equals(bs.get(i)) )
			{
				flag=false;
			}
			else {
				
			}
		}	
		
		if(flag==true)
		{
			inter.toConnect(serverName);
		}
		else
		{
			throw new Exception("Access Denied");
		}
	}
	
	
}
