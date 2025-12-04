package application;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


// must extend javafx Application class
public class TestApplicationPart1 extends Application{
	public static void main(String[] args) 
	{
		// always call the static function 
		Application.launch(args);
	}

	// must always have a start
	@Override
	public void start(Stage stage) 
	{
		
	    Drawable [] myShapes = new Drawable[4];
	    // created my own group
		Group myGroup = new Group();
		
		// first array item is created as a circle object
		myShapes[0] = new Circle(50);
		//									// the group from draw method is added to my group
		myGroup.getChildren().add(myShapes[0].draw(100, 60));
		
		Text text = new Text();
					// cast it back to circle from draw
		Circle shape = (Circle)myShapes[0];
		text.setText(String.format("Area = %.2f", shape.calcArea()));
		
		// set the X and Y coordinated for where the text(area, volume) will be
		text.setX(100);
		text.setY(60 + shape.getSide1()+ 20);
		
		// add that text to the group as well
		myGroup.getChildren().add(text);
		
		
		myShapes[1] = new Sphere(50);
								// Draw the sphere
		myGroup.getChildren().add(myShapes[1].draw(100, 210));
		// text object to add text
		Text text2 = new Text();
						// cast drawable object back to sphere
		Sphere shape2 = (Sphere)myShapes[1];	
		text2.setText(String.format("Area = %.2f\nVolume = %.2f", shape2.calcArea(), shape2.calcVolume()));
		// set the X and Y coordinated for where the text(area, volume) will be
		text2.setX(100);
		text2.setY(210 + shape.getSide1()+ 20);
		myGroup.getChildren().add(text2);
		
		//Add a Rectangle here
		myShapes[2] = new Rectangle(100,80);
		myGroup.getChildren().add(myShapes[2].draw(270,20));
		Text text3 = new Text();
		Rectangle shape3 = (Rectangle)myShapes[2];
		text3.setText(String.format("Area = %.2f", shape3.calcArea()));
		text3.setX(270);
		text3.setY(129);
		myGroup.getChildren().add(text3);
		
		//Add a Box here
		myShapes[3] = new Box(100, 80, 60);
		myGroup.getChildren().add(myShapes[3].draw(300, 210));
		Text text4 = new Text();
		Box shape4 = (Box)myShapes[3];
		text4.setText(String.format("Area = %.2f\nVolume = %.2f", shape4.calcArea(), shape4.calcVolume()));
		text4.setX(260);
		text4.setY(210 + shape4.getSide2()+ 20);
		myGroup.getChildren().add(text4);
		
		
		// camera object for moving the 3D shape
		PerspectiveCamera perspectivecamera = new PerspectiveCamera(false); 
        perspectivecamera.setTranslateX(0); 
        perspectivecamera.setTranslateY(0); 
        perspectivecamera.setTranslateZ(0); 
		
        // all objects added to my group
        // scene object or window is 400 by 400 
		Scene myScene = new Scene(myGroup, 700, 700);
		
		//scene object is the window where the shapes will show
		myScene.setCamera(perspectivecamera); 
		
		stage.setTitle("My Shapes");
		
		
	      
	      //Adding scene to the stage 
	        stage.setScene(myScene); 
	      //Displaying the contents of the stage 
		  
		stage.show();
		
	}


}
