package oops.polymorphism;
//Polymorphism : Function overRiding

class Calculation1{
	void addition(int x,int y) {
		System.out.println(x + y);
	}
}

public class Sample3 extends Calculation1{
	
	void addition(int x,int y) {
		System.out.println(x + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj = new Sample3();
		obj.addition(30, 30);
	}
}
