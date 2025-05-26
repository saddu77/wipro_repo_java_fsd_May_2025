package oops;
//constructor in java
class Employee1{
	int emp_id;
	String emp_name;
//	Default constructor
	Employee1(){
		System.out.println("Default constructor !!!");
	}
//	parameterized constructor
	 Employee1(int emp_id,String emp_name){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	void empInfo() {
		System.out.println(this.emp_id + " " + this.emp_name);
	}
}


public class Sample2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Default constructor invoked when object is created
		Employee1 obj = new Employee1();
		
		Employee1 obj1 = new Employee1(101,"Alex");
		obj1.empInfo();
		
		Employee1 obj2 = new Employee1(102,"Bob");
		obj2.empInfo();	
		
	}
}
