package oops.encapsulation;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User userObj1 = new User();
		userObj1.setUsername("John");
		userObj1.setPassword("123456");
		
		System.out.println(userObj1);
		System.out.println(userObj1.getUsername() + " " + userObj1.getPassword());
	}
}
