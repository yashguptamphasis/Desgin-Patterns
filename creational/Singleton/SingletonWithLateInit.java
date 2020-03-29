package Singleton;
class Apple1{
	public int a=5;
	private Apple1()
	{
		System.out.println("Const called");
	}
	static Apple1 apple;
	public static Apple1 getApple()
	{
		if(apple==null)
		{
			synchronized (Apple1.class) {
				if(apple==null)
				{
					apple= new Apple1();
				}
			}
			
		}
		
		
			return apple;
		
		
	}
}
public class SingletonWithLateInit {
	public static void main(String args[])
	{
	Apple1 obj=Apple1.getApple();
	
	System.out.println(obj.a);
	obj.a=10;	
	
	Apple1 obj1=Apple1.getApple();
	System.out.println(obj.a);

	}
}