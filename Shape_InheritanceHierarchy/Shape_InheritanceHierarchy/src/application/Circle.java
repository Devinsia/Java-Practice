package application;
import javafx.scene.Group;

public class Circle extends TwoDShape {
	public Circle(int side1) {
		super(side1);
	}
	
	@Override
	public double calcArea() {
		return PI * Math.pow(getSide1(),2);
				
	}
	
	@Override
	public Group draw(int x, int y) {
		
		javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle();
		
		circle.setRadius(getSide1());
		
		circle.setTranslateX(x);
		circle.setTranslateY(y);
		
		Group root = new Group(circle);
		return root;
		
	}
}
