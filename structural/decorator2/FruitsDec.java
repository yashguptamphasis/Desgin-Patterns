package structural.decorator2;

public class FruitsDec implements MilkShake{

	MilkShake ms;
	FruitsDec(MilkShake ms)
	{
		this.ms=ms;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ms.getName()+" FruitsDec";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub

		return ms.getCost()+20;
	}

}
