package vjezba11_1;

import java.util.Scanner;

public class QuotientWithMethod {

	public static int quotient(int fnum, int snum){
		if(snum == 0){
			System.out.println("Divisor cannot be zero");
			System.exit(1);
		}
			return fnum / snum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int result = quotient(num1, num2);
		System.out.println("Number " + num1 + " divided by " + num2 + " is " + result);
	}
}