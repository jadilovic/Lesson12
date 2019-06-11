package vjezba11_1;

public class Test {
		public static void main(String[] args) {
		try {
			int value = 30;
			if (value < 40)
		throw new Exception("value is too small");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Continue after the catch block");
		
		for (int i = 0; i < 2; i++) {
			System.out.print(i + " ");
			try {
			System.out.println(1 / 0);
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		try {
			for (int i = 0; i < 2; i++) {
			System.out.print(i + " ");
			System.out.println(1 / 0);
			}
		}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
	}
}

