package accessmodifiers;

public class Sample1 {
//	private access modifier
	private static int marks = 100;
//	default access modifier
	static int age = 33;
//protected access modifier	
	protected static boolean flag = true;
//public access modifier
	public static String name = "John";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Marks is : " + marks);
		System.out.println("Age is :" + age);
		System.out.println("Flag is: " + flag);
		System.out.println("Name is : " + name);
	}

}
