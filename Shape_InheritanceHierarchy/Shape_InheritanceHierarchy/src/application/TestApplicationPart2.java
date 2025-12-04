package application;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestApplicationPart2 extends Application{
	public static void main(String[] args) 
	{
		// always call the static function 
		Application.launch(args);
	}

	// must always have a start
    @Override
    public void start(Stage stage) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numShapes = input.nextInt();

        Drawable[] myShapes = new Drawable[numShapes];
        Group myGroup = new Group();

        int sceneWidth = 700;
        int sceneHeight = 700;

        for (int i = 0; i < numShapes; i++) {
            System.out.println("Shape " + (i + 1) + ":");
            System.out.print("Enter type of the shape (0:Circle, 1:Sphere, 2:Rectangle, 3:Box):\n");
            int type = input.nextInt();

            Text text = new Text();
            int x = 0, y = 0, width = 0, height = 0, depth = 0, radius = 0;

            switch (type) {
                case 0 -> { // Circle
                    System.out.print("Enter radius, x coordinate, y coordinate:\n");
                    radius = input.nextInt();
                    x = input.nextInt();
                    y = input.nextInt();

                    myShapes[i] = new Circle(radius);
                    myGroup.getChildren().add(myShapes[i].draw(x, y));

                    Circle shape = (Circle) myShapes[i];
                    text.setText(String.format("Area = %.2f", shape.calcArea()));
                    text.setX(x - radius / 2);
                    text.setY(y + radius + 20);

                    if (x + radius + 50 > sceneWidth) sceneWidth = x + radius + 50;
                    if (y + radius + 50 > sceneHeight) sceneHeight = y + radius + 50;
                }
                case 1 -> { // Sphere
                    System.out.print("Enter radius, x coordinate, y coordinate:\n");
                    radius = input.nextInt();
                    x = input.nextInt();
                    y = input.nextInt();

                    myShapes[i] = new Sphere(radius);
                    myGroup.getChildren().add(myShapes[i].draw(x, y));

                    Sphere shape = (Sphere) myShapes[i];
                    text.setText(String.format("Area = %.2f\nVolume = %.2f", shape.calcArea(), shape.calcVolume()));
                    text.setX(x - radius / 2);
                    text.setY(y + radius + 20);

                    if (x + radius + 50 > sceneWidth) sceneWidth = x + radius + 50;
                    if (y + radius + 50 > sceneHeight) sceneHeight = y + radius + 50;
                }
                case 2 -> { // Rectangle
                    System.out.print("Enter width, height, x coordinate, y coordinate:\n");
                    width = input.nextInt();
                    height = input.nextInt();
                    x = input.nextInt();
                    y = input.nextInt();

                    myShapes[i] = new Rectangle(width, height);
                    myGroup.getChildren().add(myShapes[i].draw(x, y));

                    Rectangle shape = (Rectangle) myShapes[i];
                    text.setText(String.format("Area = %.2f", shape.calcArea()));
                    text.setX(x);
                    text.setY(y + height + 20);

                    if (x + width + 50 > sceneWidth) sceneWidth = x + width + 50;
                    if (y + height + 50 > sceneHeight) sceneHeight = y + height + 50;
                }
                case 3 -> { // Box
                    System.out.print("Enter width, height, depth, x coordinate, y coordinate:\n");
                    width = input.nextInt();
                    height = input.nextInt();
                    depth = input.nextInt();
                    x = input.nextInt();
                    y = input.nextInt();

                    myShapes[i] = new Box(width, height, depth);
                    myGroup.getChildren().add(myShapes[i].draw(x, y));

                    Box shape = (Box) myShapes[i];
                    text.setText(String.format("Area = %.2f\nVolume = %.2f", shape.calcArea(), shape.calcVolume()));
                    text.setX(x);
                    text.setY(y + height + 20);

                    if (x + width + 50 > sceneWidth) sceneWidth = x + width + 50;
                    if (y + height + 50 > sceneHeight) sceneHeight = y + height + 50;
                }
                default -> {
                    System.out.println("Invalid shape type, skipping...");
                    continue;
                }
            }

            myGroup.getChildren().add(text);
        }

        input.close();

        PerspectiveCamera perspectiveCamera = new PerspectiveCamera(false);
        Scene myScene = new Scene(myGroup, sceneWidth, sceneHeight);
        myScene.setCamera(perspectiveCamera);

        stage.setTitle("User Input Shapes");
        stage.setScene(myScene);
        stage.show();
    }
}