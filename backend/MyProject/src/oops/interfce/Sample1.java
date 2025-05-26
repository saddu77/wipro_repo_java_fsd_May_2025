package oops.interfce;

interface I1{
	void show();
	void display();
}

public class Sample1 implements I1{

	public void show() {
		System.out.println("msg from show...");
	}
	
	public void display() {
		System.out.println("msg from display...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj = new Sample1();
		obj.show();
		obj.display();
	}

}
