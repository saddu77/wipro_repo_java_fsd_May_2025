package oops.polymorphism;

class Person1{
	public void showRole() { 
		System.out.println("I am a Person"); 
		} 
}

class Employee1 extends Person1 { 
	@Override 
	public void showRole() { 
		System.out.println("I am an Employee"); 
	} 
}

class Student1 extends Person1 { 
	@Override 
	public void showRole() { 
		System.out.println("I am a Student"); 
	} 
} 

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Employee1(); 
		Person1 p2 = new Student1(); 
		p1.showRole();  // Outputs: I am an Employee 
		p2.showRole();  // Outputs: I am a Student 
	}

}
