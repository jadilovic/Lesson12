package vjezba11_1;

public class CircleWithException {
	
	private double radius;
	private static int numObjec;
	
	public CircleWithException(){
		this(1.0);
	}
	
	public CircleWithException(double newRadius){
		setRadius(newRadius);
		numObjec++;
	}
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) throws IllegalArgumentException {
		if(radius >= 0)
		this.radius = radius;
		else
			throw new IllegalArgumentException("Num cannot be negative");
	}
	/**
	 * @return the numObjec
	 */
	public static int getNumObjec() {
		return numObjec;
	}
	
	public double findArea(){
		return radius * radius * 1.14;
	}
}
