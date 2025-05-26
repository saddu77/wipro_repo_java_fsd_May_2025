package oops.polymorphism;
//Poly morphism : Function Overloading
class Calculation{
	void addition(int x,int y) {
		System.out.println(x + y);
	}
	
	void addition(int x,int y,int z) {
		System.out.println(x + y + z);
	}
}

public class Sample2 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Calculation();
		obj.addition(30, 30, 30);
		obj.addition(50,50);
		
	}

}
