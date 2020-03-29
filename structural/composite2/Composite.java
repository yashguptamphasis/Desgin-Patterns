package structural.composite2;

import java.util.ArrayList;

public class Composite implements Component {

	String name;
	
	ArrayList<Component> ar= new ArrayList<Component>();
	void addComposite(Component c)
	{
		ar.add(c);
	}
	public Composite(String name) {
		super();
		this.name = name;
	}

	int price1=0;
	@Override
	public int price() {
		// TODO Auto-generated method stub
		
		for(Component c: ar)
		{
			price1= price1 +c.price();
		}
		System.out.println(name+" : "+ price1);
		return price1;
	}

}
