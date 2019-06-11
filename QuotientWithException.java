package vjezba11_1;

import java.util.Scanner;

public class QuotientWithException {

	public static int quotient(int fnum, int snum){
		if(snum == 0)
			throw new ArithmeticException("Cannot be zero");
	
			return fnum / snum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try {
		int result = quotient(num1, num2);
		System.out.println("Number " + num1 + " divided by " + num2 + " is " + result);
		}
		catch(ArithmeticException ex){
			System.out.println("Exception: an integer cannot be divided by zero ");
		}
		
		System.out.println("Execution continues");
	}
}
