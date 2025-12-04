package application;

public abstract class Shape implements Drawable {
	private double side1;
	public static final double PI = 3.14;
	
	public Shape(double side1) {
		setSide1(side1);
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public abstract double calcArea();
	
	// dosen't need to provide implementation of the implemented interface method 
	// because its an abstract class
}
