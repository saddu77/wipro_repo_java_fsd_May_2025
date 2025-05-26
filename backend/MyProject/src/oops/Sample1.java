package oops;
//class is a collection of variables and functions
class Employee{
	int emp_id = 101;
	String emp_name = "John";
	
	void empInfo() {
		System.out.println(emp_id + " " + emp_name);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassName var_name = new ClassName();
		Employee empObj = new Employee();
		empObj.empInfo();
	}

}
