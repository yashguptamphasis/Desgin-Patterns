package structural.facade;

public class ShopKeeper {
	
	Iphone iphone;
	Samsung samsung;
	Oppo oppo;
	public ShopKeeper() {
		super();
		this.iphone = new Iphone();
		this.samsung = new Samsung();
		this.oppo = new Oppo();
	}

	Mobile getIphone()
	{
		return iphone;
	}
	

	Mobile getSamsung()
	{
		return samsung;
	}

	Mobile getOppo()
	{
		return oppo;
	}
	
}
