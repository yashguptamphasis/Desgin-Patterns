package structural.decorator2;

public class Vanilla implements MilkShake{

	String name="Vanilla";
	@Override
	public String getName() {
		// TODO Auto-generated method stub

		return name;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}

}
