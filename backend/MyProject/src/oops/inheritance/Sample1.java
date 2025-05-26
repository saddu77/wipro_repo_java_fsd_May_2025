package oops.inheritance;

//Parent class
class A{
	int number1 = 20;
}

//child class
class B extends A{
	int number2 = 30;
	int result;
	
	void addition() {
		result = number1 + number2;
		System.out.println("sum of two numbers are: " + result);
	}
}
public class Sample1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.addition();
	}

}
