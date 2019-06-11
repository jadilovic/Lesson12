package vjezba11_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter an integer");
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do{
			try{
				int num = input.nextInt();
				System.out.println("Number entered " + num + " is integer");
				continueInput = false;
			}
			catch(InputMismatchException ex){
				System.out.println("You did not enter integer. Please try agian");
				input.nextLine();
			}
		} while(continueInput);
		
		long value = Long.MAX_VALUE + 1;
		System.out.println(value);
	}
}
