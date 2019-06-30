package vjezba11_1;

import java.util.Scanner;

public class Mjeseci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesi broj mjeseca");
		Scanner input = new Scanner(System.in);
		
		int mjesec = input.nextInt();
		
		switch (mjesec){
		case 1: System.out.println(mjesec + ". mjesec je januar");
		break;
		case 2: System.out.println(mjesec + ". mjesec je februar");
		break;
		case 3: System.out.println(mjesec + ". mjesec je mart");
		break;
		case 4: System.out.println(mjesec + ". mjesec je april");
		break;
		case 5: System.out.println(mjesec + ". mjesec je maj");
		break;
		case 6: System.out.println(mjesec + ". mjesec je juni");
		break;
		case 7: System.out.println(mjesec + ". mjesec je juli");
		break;
		case 8: System.out.println(mjesec + ". mjesec je august");
		break;
		case 9: System.out.println(mjesec + ". mjesec je septembar");
		break;
		case 10: System.out.println(mjesec + ". mjesec je oktobar");
		break;
		case 11: System.out.println(mjesec + ". mjesec je novembar");
		break;
		case 12: System.out.println(mjesec + ". mjesec je decembar");
		break;
		default: System.out.println("Unijeli ste nepostojeci broj mjeseca");
		break;
		}
		input.close();
	}

}
