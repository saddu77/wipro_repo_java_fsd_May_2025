package oops.inheritance;

class Person { 
	String name="Alex";
	int age=21; 
	
	public void display() { 
		System.out.println("Name: " + name + ", Age: " + age); 
	} 
} 
class Employee extends Person { 
	String company="IBM";
	
	public void showCompany() { 
		System.out.println("Company: " + company); 
	} 
} 
public class Sample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empObj = new Employee();
		empObj.display();
		empObj.showCompany();
	}
}
