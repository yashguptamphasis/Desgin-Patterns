package structural.decorator;

public abstract class Pizza {

	String description="Unkown Pizza";
	public abstract int getCost();
	public String getDescription()
	{
		return "from description: "+description;
	}
}	
