package structural.decorator;

import javax.management.Descriptor;
class Margherita extends Pizza{

	Margherita()
	{
		description="Margherita";
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}
}

class FarmHouse extends Pizza{


	FarmHouse()
	{
		description="FarmHouse";
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 200;
	}	
}

public class PennyPanner extends Pizza{


	PennyPanner()
	{
		description="PennyPanner";
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 250;
	}	
}
