package oops.abstraction;

abstract class Task{
	void scanning(){
		System.out.println("Scanning ...");
	}	
	abstract void printing();
}
public class Sample1 extends Task {
	@Override
	void printing() {
		// TODO Auto-generated method stub
		System.out.println("Printing...");
	}
	public static void main(String[] args) {
		Sample1 obj = new Sample1();
		obj.printing();
		obj.scanning();
	}
	

	
}
