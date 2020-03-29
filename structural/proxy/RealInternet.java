package structural.proxy;

public class RealInternet implements Internet{

	
	
	@Override
	public void toConnect(String serverName) throws Exception {
		System.out.println("Connceted to the server named : "+serverName);	
	}
}
