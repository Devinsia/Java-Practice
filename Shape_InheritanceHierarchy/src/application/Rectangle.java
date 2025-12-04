package application;
import javafx.scene.Group;

public class Rectangle extends TwoDShape{
	private double side2;
	
	public Rectangle(double side1, double side2) {
		super(side1);
		setSide2(side2);
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double getSide2() {
		return side2;
	}
	
	@Override
	public double calcArea() {
		return getSide1() * getSide2();
	}
	
	@Override
	public Group draw(int x, int y) {
		
		javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle();
		rect.setWidth(getSide1());
		rect.setHeight(getSide2());
		
		rect.setX(x);
		rect.setY(y);
		
		Group root = new Group(rect);
		return root;
	}
}

