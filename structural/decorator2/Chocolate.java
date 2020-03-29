package structural.decorator2;

public class Chocolate implements MilkShake{
	String name="Chocolate";
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 110;
	}

}
