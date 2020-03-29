package structural.facade;

public class Iphone implements Mobile{
	@Override
	public String toString() {
		return "Iphone [price=" + price + ", name=" + name + "]";
	}

	int price=50000;
	String name="Iphone";
	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println(price);
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Iphone");
	}

}
