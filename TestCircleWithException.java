package vjezba11_1;

import java.util.Scanner;

public class TestCircleWithException {

	public static void main(String[] args) {

		
		try{
			CircleWithException a = new CircleWithException();
			CircleWithException b = new CircleWithException(-2);
			CircleWithException c = new CircleWithException(6);
			CircleWithException d = new CircleWithException(9);
			System.out.println("Area of first object is " + a.findArea());
		} catch(IllegalArgumentException ex){
			System.out.println("Negative number cannot be radius");
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
			System.out.println(ex.getStackTrace());
			ex.printStackTrace();
			System.out.println(ex.toString());
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " + CircleWithException.getNumObjec());
		
		
		try {
			int[] list = new int[10];
			System.out.println("list[10] is " + list[10]);
			}
			catch (ArithmeticException ex) {
			System.out.println("ArithmeticException");
			}
			catch (RuntimeException ex) {
			System.out.println("This is RuntimeException");
			}
			catch (Exception ex) {
			System.out.println("Exception");
			}
		
		try {
			method();
			System.out.println("After the method call");
			}
			catch (ArithmeticException ex) {
			System.out.println("This is ArithmeticException in method");
			}
			catch (RuntimeException ex) {
			System.out.println("RuntimeException");
			}
			catch (Exception e) {
			System.out.println("Exception");
			}
		
		try {
			method2();
			System.out.println("After the method call");
			}
			catch (RuntimeException ex) {
			System.out.println("RuntimeException in main");
			}
			catch (Exception ex) {
			System.out.println("Exception in main");
			}
		}
			static void method2() throws Exception {
				try {
					String s = "abc";
					System.out.println(s.charAt(3));
				}
					catch (RuntimeException ex) {
							System.out.println("RuntimeException in method2()");
						}
					catch (Exception ex) {
							System.out.println("Exception in method()2");
						}
				try{
				m(30);
				} catch (Exception ex){
					System.out.println(ex.getMessage());
				}
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Please enter a string");
				String word = input.nextLine();
				System.out.println(isNumeric(word));
		}
			static void method() throws Exception {
				System.out.println(1 / 0);
			}
			
			public static void m(int value) throws Exception {
				if (value < 40)
				throw new Exception("value is too small");
				else
					System.out.println("Higher than 40 which is OK");
				}
			
			
			public static boolean isNumeric(String token) {
				return token.matches("-?\\d+(\\.\\d+)?");
			}
	}