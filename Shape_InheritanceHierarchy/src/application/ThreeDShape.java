package application;

public abstract class ThreeDShape extends Shape{
	
	public ThreeDShape(double side1) {
		super(side1);
	}
	
	public abstract double calcVolume();

}
