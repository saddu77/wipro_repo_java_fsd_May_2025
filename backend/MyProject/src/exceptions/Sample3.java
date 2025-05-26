package exceptions;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		int res;
		
		System.out.println("Begin");
		try {
			res = 20 / 0;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("End");
	}

}
