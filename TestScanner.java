package vjezba11_1;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter something");
		int intValue = input.nextInt();
		double doubleValue = input.nextDouble();
		String line = input.nextLine();
		
		System.out.println(intValue + " " + doubleValue + " " + line);
	}

}
