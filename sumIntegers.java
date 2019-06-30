package vjezba11_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sumIntegers {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secondNum = 0;
		
	firstNum = first();
	secondNum = first();
	

			System.out.println("Sum two integers " + firstNum + " and " + secondNum + " is " + (firstNum + secondNum));
		}

	private static int first() {
		Scanner input = new Scanner(System.in);
		boolean number = false;
		int Num = 0;
		do{
			try{
				System.out.println("Please enter number");
				Num = input.nextInt();
				number = true;
				} catch (InputMismatchException ex){
					System.out.println("Did not enter integer. Please try again");
					input.nextLine();
					}
		} while (number == false);
		return Num;
	}
}
