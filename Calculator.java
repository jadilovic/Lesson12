package vjezba11_1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
				// Check command line parameter usage
		double firstNum = 0;
		double secondNum = 0;
		
			if (args.length != 3) {
			System.out.println("Usage: java Calculator firstNum operation secondNum");
				System.exit(1);
				}

			if (isNumeric(args[0])) {
				firstNum = Double.parseDouble(args[0]);
				} else {
					System.out.println("First character entered " + args[0] + " is not number");
					System.exit(2);
				}
				
			if (isNumeric(args[2]))
				secondNum = Double.parseDouble(args[2]);
			else {
				System.out.println("Second character entered " + args[2] + " is not number");
				System.exit(3);
			}
			
		 String operation = args[1];
			switch (operation) {
			
			  case "+":
			    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
			    break;
			    
			  case "-":
			    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
			    break;
			    
			  case "*":
				    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
				    break;
			    
			  case "/":
				    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
				    break;
				    
			  default:
			    System.out.println("Wrong operations");
			}
	}


	public static boolean isNumeric(String strNum) {
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}
}







