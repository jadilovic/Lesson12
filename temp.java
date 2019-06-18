package vjezba11_1;

import java.io.File;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("temp.txt");
		if(file.exists()){
			System.out.println("File " + file + " already exists.");
			System.exit(1);
		}
		try(java.io.PrintWriter output = new java.io.PrintWriter("temp.txt");){
				output.printf("amount is %f %e\r\n", 32.32, 32.32);
				output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
				output.printf("%6b\r\n", (1 > 2));
				output.printf("%6s\r\n", "Java");
				output.close();
		}
		
		Scanner input = new Scanner(file);
		while(input.hasNext()){
			String wor = input.next();
			String wor2 = input.next();
			float num1 = input.nextFloat();
			float num2 = input.nextFloat();
			System.out.println(wor + " " + wor2 + " " + num1 + " " + num2);
		}
		input.close();
	}
}
