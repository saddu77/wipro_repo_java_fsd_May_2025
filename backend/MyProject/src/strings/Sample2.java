package strings;

public class Sample2 {

	public static void main(String[] args) {
//		Strings are immutable 
		// TODO Auto-generated method stub
		String name = "John"; //John
		name.concat(" Doe");  // John Doe
		System.out.println(name); //John
		
		name = name.concat(" Doe");
		System.out.println(name); //John Doe
	}

}
