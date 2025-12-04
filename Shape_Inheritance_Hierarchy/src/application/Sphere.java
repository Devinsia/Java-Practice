package application;
import javafx.scene.Group;

public class Sphere extends ThreeDShape{
	public Sphere (double side1) {
		super(side1);
	}
	
	@Override
	public double calcArea() {
		return 4 * PI * getSide1() * getSide1();
	}
	
	@Override
	public double calcVolume() {
		return 4.0/3 * PI * Math.pow(getSide1(),  3);
	}
	
	@Override
	public Group draw(int x, int y) {
		javafx.scene.shape.Sphere sphere = new javafx.scene.shape.Sphere();
		sphere.setRadius(getSide1());
		
		sphere.setTranslateX(x);
		sphere.setTranslateY(y);
		
		Group root = new Group(sphere);
		return root;
	}
	
}
