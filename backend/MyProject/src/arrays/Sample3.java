package arrays;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {10,20,30,40,50};
		 int total = 0;
		 for(int i = 0; i < numbers.length; i++) {
			 total += numbers[i];
		 }
		 System.out.println("Total is: " + total);
	}

}
