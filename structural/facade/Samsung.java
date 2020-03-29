package structural.facade;

public class Samsung implements Mobile{
	@Override
	public String toString() {
		return "Samsung [price=" + price + ", name=" + name + "]";
	}

	int price=40000;
	String name="samsung";
	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println(price);
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("samsung");
	}

}
