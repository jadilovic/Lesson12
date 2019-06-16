package vjezba11_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File file = new File("scores.txt");
		if(file.exists()){
			System.out.println("File already exists");
			System.exit(1);
		}
		
		PrintWriter output = new PrintWriter(file);
		output.print("Adian B Adilovic ");
		output.println(9);
		output.print("Jasmin D Dol ");
		output.println(40);
		
		System.out.println(file.exists());
		
		output.close();
	}

}
