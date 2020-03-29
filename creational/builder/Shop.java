package builder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myphone= new Phone("Android",2,"DualCore",5.5,3000);
		System.out.println(myphone); 
		
		Phone p= new PhoneBuilder().setOs("Apple").setRam(4).getPhone();
		System.out.println(p);
	}

}
