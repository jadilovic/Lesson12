package vjezba11_1;

public class ChainedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch (Exception ex) {
		ex.printStackTrace();
		System.out.println("Main");
		}
	}
		
		public static void method1() throws Exception {
		try {
			method2();
			}
		catch (Exception ex) {
			throw new Exception("New info from method1", ex);
			
			}
		System.out.println("Method 1");
		}
		
		public static void method2() throws Exception {
			throw new Exception("New info from method2");
	}
}
