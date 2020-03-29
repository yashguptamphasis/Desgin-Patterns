package structural.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1= new Margherita();
		System.out.println(p1.getDescription()+" "+p1.getCost());
		
		p1= new FreshTomato(p1);
		System.out.println(p1.getDescription()+" "+p1.getCost());
		p1= new Barbue(p1);
		System.out.println(p1.getDescription()+" "+p1.getCost());
	
	}

}
