package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	String name;
	
	List<Component> list = new ArrayList<Component>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Component c1: list)
		{
			c1.showPrice();
		}
	}
	
	public void addComponent(Component c)
	{
		list.add(c);
	}
	
}
