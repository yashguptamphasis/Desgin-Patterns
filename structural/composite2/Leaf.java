package structural.composite2;

public class Leaf implements Component {

	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	int price;
	String name;
	
	@Override
	public int price() {
		// TODO Auto-generated method stubs
		System.out.println(name+" : "+price);
		return price;
	}

}
