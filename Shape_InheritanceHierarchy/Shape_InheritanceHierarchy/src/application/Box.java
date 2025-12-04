package application;
import javafx.scene.Group;

public class Box extends ThreeDShape{
	private double side2;
	private double side3;
	
	public Box(double side1, double side2, double side3) {
		super(side1);
		setSide2(side2);
		setSide3(side3);
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	@Override
	public double calcArea() {
		return getSide1() * getSide2();
	}
	
	@Override
	public double calcVolume() {
		return getSide1()* getSide2() * getSide3();
	}
	
	@Override 
	public Group draw(int x, int y) {
		
		javafx.scene.shape.Box box = new javafx.scene.shape.Box();
		box.setRotate(20);
		box.setTranslateX(x);
		box.setTranslateY(y);
		
		box.setWidth(getSide1());
		box.setHeight(getSide2());
		box.setDepth(getSide3());
		
		Group root = new Group(box);
		return root;
	}
}
