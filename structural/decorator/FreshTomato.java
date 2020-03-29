package structural.decorator;

public class FreshTomato extends ToppingDecorator{

	Pizza pizza;
	public FreshTomato(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.description+" FreshTomato";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost()+40;
	}
}

class Barbue extends ToppingDecorator{

	Pizza pizza;
	public Barbue(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.description+" Barbue";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost()+50;
	}
}
