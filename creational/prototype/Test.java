package prototype;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRecord emp1= new EmployeeRecord(1,"Yash","Manager", 1000, "VN");
		
		
		EmployeeRecord emp2= (EmployeeRecord)emp1.getClone();
		emp1.setId(3);
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
