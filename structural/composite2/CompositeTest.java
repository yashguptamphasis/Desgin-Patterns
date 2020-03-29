package structural.composite2;

public class CompositeTest {
	public static void main(String args[])
	{
		Component steering = new Leaf(4000,"Steering");
		Component brakes = new Leaf(2000,"brakes");
		Component seatbelt = new Leaf(1000,"Seatbelt");
		Component airbag = new Leaf(11000,"airbag");
		
		Composite systems= new Composite("systems");
		Composite safety= new Composite("safety");
		Composite car= new Composite("car");
		
		systems.addComposite(steering);
		systems.addComposite(brakes);
		
		safety.addComposite(seatbelt);
		safety.addComposite(airbag);
		
		car.addComposite(systems);
		car.addComposite(safety);
		
		System.out.println(car.price());
	}
}
