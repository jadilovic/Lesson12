package vjezba11_1;

import java.io.File;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		File file = new File("scores.txt");
		
		try(Scanner input = new Scanner(file);){
			System.out.println("Information in the file is:");
			while(input.hasNext()){
				String name = input.next();
				String in = input.next();
				String last = input.next();
				int num = input.nextInt();
				System.out.println(name + " " + in + " " + last + " " + num);
			}
		}
		
		Scanner input = new Scanner("13 14");
		int sum = input.nextInt() + input.nextInt();
		System.out.println("Sum is " + sum);
	}
}
