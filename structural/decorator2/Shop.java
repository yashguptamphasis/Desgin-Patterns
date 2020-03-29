package structural.decorator2;

public class Shop {
	public static void main(String args[])
	{
		MilkShake vali= new Vanilla();
		//System.out.println(vali.getName()+" "+vali.getCost());
		vali= new FruitsDec(vali);
		//System.out.println(vali.getName()+" "+vali.getCost());
		
		vali= new FruitsDec(vali);
		
		System.out.println(vali.getName()+" "+vali.getCost());
	}
}	
