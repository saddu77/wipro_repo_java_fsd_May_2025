package variablesandfunctions;

import java.util.Scanner;

public class TestSample1 {
	
	static void addition(int num1,int num2){
		int result;
		result = num1 + num2;
		System.out.println("Sum of two numbers are: "+ result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		addition(num1,num2);
		
	}
}
