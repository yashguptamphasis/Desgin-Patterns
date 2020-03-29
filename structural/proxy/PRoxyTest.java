package structural.proxy;

public class PRoxyTest {
	public static void main(String args[]) throws Exception
	{
		String s="abc";
		
		ProxyInternet p = new ProxyInternet();
		p.toConnect(s);
		
	}
}
