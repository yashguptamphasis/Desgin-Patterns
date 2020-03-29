package Singleton;
class Apple{
	private Apple()
	{
		System.out.println("const called");
	}
	static Apple apple=new Apple();
	public static Apple getApple()
	{
		return apple;
	}
	int a=5;
}


public class SingletonWithEarlyInit {
	public static void main(String args[])
	{
		Apple obj=Apple.getApple();
		System.out.println(obj.a);
		obj.a=20;
		Apple obj1=Apple.getApple();
		System.out.println(obj1.a);
	}
}
