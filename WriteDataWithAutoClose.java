package vjezba11_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		File dok = new File("rezult.txt");
		if(dok.exists()){
			System.out.println("This file already exists");
			System.exit(1);
		}
		
		try(PrintWriter unos = new PrintWriter(dok);){
			unos.print("Willz T Smith ");
			unos.println(77);
			unos.print("Bruce K Lee ");
			unos.println(66);
		}
	}
}
