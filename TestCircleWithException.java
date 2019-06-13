package vjezba11_1;

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
		}
		
		System.out.println("Number of objects created: " + CircleWithException.getNumObjec());
	}

}
