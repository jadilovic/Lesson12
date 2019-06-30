package vjezba11_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int[] random = new int[100];
		for(int i = 0; i < random.length; i++){
			random[i] = (int)(Math.random() * (100 + 1));
			System.out.print("Index:" + i + ":" + random[i] + " ");
			count++;
			if(count == 10){
				System.out.println();
				count = 0;
			}
		}
		System.out.println("Please enter an index of of an Array in range 0 to 99");
		Scanner input = new Scanner(System.in);
		
		try{
			int indexNum = input.nextInt();
			System.out.println("Broj na index poziciji " + indexNum + " je " + random[indexNum]);
			input.close();
		} catch (InputMismatchException ex){
			System.out.println("Unesen pogresan znak");
			System.exit(2);
		} catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of Bounds");
			System.exit(1);
		}
	}
}
