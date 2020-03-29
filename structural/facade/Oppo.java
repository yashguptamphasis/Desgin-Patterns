package structural.facade;

public class Oppo implements Mobile{
	@Override
	public String toString() {
		return "Oppo [price=" + price + ", name=" + name + "]";
	}

	int price=20000;
	String name="Oppo";
	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println(price);
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
