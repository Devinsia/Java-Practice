package application;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestApplicationPart3 extends Application{
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
        
        // to prevent shape overlap
        int[][] occupiedAreas = new int[numShapes][4]; // bounding boxes: {x1, y1, x2, y2}
        int occupiedCount = 0; // number of shapes already placed
        
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
	
	                // Make sure it’s not drawn offscreen
	                if (x - radius < 10) x = radius + 10;
	                if (y - radius < 10) y = radius + 10;
	
	                // Define bounding box (based on center)
	                int x1 = x - radius;
	                int y1 = y - radius;
	                int x2 = x + radius;
	                int y2 = y + radius;
	
	                // Check overlap with all previous shapes
	                boolean shifted = false;
	                for (int j = 0; j < occupiedCount; j++) {
	                    int[] area = occupiedAreas[j];
	                    if (x2 > area[0] && x1 < area[2] && y2 > area[1] && y1 < area[3]) {
	                        System.out.println("Warning: this circle overlaps a previous shape. Automatically shifting...");
	                        // Shift just enough to clear overlap
	                        int shiftX = (area[2] - x1) + 10;
	                        int shiftY = (area[3] - y1) + 10;
	                        x += shiftX;
	                        y += shiftY;
	                        x1 = x - radius;
	                        y1 = y - radius;
	                        x2 = x + radius;
	                        y2 = y + radius;
	                        shifted = true;
	                    }
	                }
	                if (shifted) System.out.println("New coordinates: x=" + x + ", y=" + y);
	
	                // Create and draw
	                myShapes[i] = new Circle(radius);
	                // Adjust to draw using top-left of bounding box
	                myGroup.getChildren().add(myShapes[i].draw(x - radius, y - radius));
	
	                Circle shape = (Circle) myShapes[i];
	                text.setText(String.format("Area = %.2f", shape.calcArea()));
	
	                // Keep text visible
	                text.setX(Math.max(10, x - radius / 2));
	                text.setY(Math.min(sceneHeight - 20, y + radius + 30));
	
	                myGroup.getChildren().add(text);
	
	                occupiedAreas[occupiedCount++] = new int[]{x1, y1, x2, y2};
	
	                if (x2 + 50 > sceneWidth) sceneWidth = x2 + 50;
	                if (y2 + 50 > sceneHeight) sceneHeight = y2 + 50;
	            }
                case 1 -> { // Sphere
                    System.out.print("Enter radius, x coordinate, y coordinate:\n");
                    radius = input.nextInt();
                    x = input.nextInt();
                    y = input.nextInt();

                    int x1 = x - radius;
                    int y1 = y - radius;
                    int x2 = x + radius;
                    int y2 = y + radius;

                    boolean shifted = false;
                    for (int j = 0; j < occupiedCount; j++) {
                        int[] area = occupiedAreas[j];
                        if (x2 > area[0] && x1 < area[2] && y2 > area[1] && y1 < area[3]) {
                            System.out.println("Warning: this sphere overlaps a previous shape. Automatically shifting...");
                            x += 50;
                            y += 50;
                            x1 = x - radius;
                            y1 = y - radius;
                            x2 = x + radius;
                            y2 = y + radius;
                            shifted = true;
                        }
                    }
                    if (shifted) System.out.println("New coordinates: x=" + x + ", y=" + y);

                    myShapes[i] = new Sphere(radius);
                    myGroup.getChildren().add(myShapes[i].draw(x, y));

                    Sphere shape = (Sphere) myShapes[i];
                    text.setText(String.format("Area = %.2f\nVolume = %.2f", shape.calcArea(), shape.calcVolume()));
                    text.setX(x - radius / 2);
                    text.setY(y + radius + 20);

                    occupiedAreas[occupiedCount++] = new int[]{x1, y1, x2, y2};

                    if (x2 + 50 > sceneWidth) sceneWidth = x2 + 50;
                    if (y2 + 50 > sceneHeight) sceneHeight = y2 + 50;
                }
                case 2 -> { // Rectangle
                    System.out.print("Enter width, height, x coordinate, y coordinate:\n");
                    width = input.nextInt();
                    height = input.nextInt();
                    x = input.nextInt();
                    y = input.nextInt();

                    int x1 = x;
                    int y1 = y;
                    int x2 = x + width;
                    int y2 = y + height;

                    boolean shifted = false;
                    boolean overlap;

                    do {
                        overlap = false;
                        for (int j = 0; j < occupiedCount; j++) {
                            int[] area = occupiedAreas[j];
                            if (x2 > area[0] && x1 < area[2] && y2 > area[1] && y1 < area[3]) {
                                System.out.println("Warning: overlap detected. Automatically shifting...");
                                x += 50;
                                y += 50;
                                x1 = x - radius;  // or x1 = x if it's a rectangle/box
                                y1 = y - radius;
                                x2 = x + radius;
                                y2 = y + radius;
                                overlap = true;
                                shifted = true;
                            }
                        }
                    } while (overlap);

                    if (shifted)
                        System.out.println("New coordinates: x=" + x + ", y=" + y);

                    

                    myShapes[i] = new Rectangle(width, height);
                    myGroup.getChildren().add(myShapes[i].draw(x, y));

                    Rectangle shape = (Rectangle) myShapes[i];
                    text.setText(String.format("Area = %.2f", shape.calcArea()));
                    text.setX(x);
                    text.setY(y + height + 20);

                    occupiedAreas[occupiedCount++] = new int[]{x1, y1, x2, y2};

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

                    // Keep box within visible range
                    if (x < 10) x = 10;
                    if (y < 10) y = 10;

                    int x1 = x;
                    int y1 = y;
                    int x2 = x + width;
                    int y2 = y + height;

                    // Overlap detection
                    boolean shifted = false;
                    for (int j = 0; j < occupiedCount; j++) {
                        int[] area = occupiedAreas[j];
                        if (x2 > area[0] && x1 < area[2] && y2 > area[1] && y1 < area[3]) {
                            System.out.println("Warning: this box overlaps a previous shape. Automatically shifting...");
                            int shiftX = (area[2] - x1) + 10;
                            int shiftY = (area[3] - y1) + 10;
                            x += shiftX;
                            y += shiftY;
                            x1 = x;
                            y1 = y;
                            x2 = x + width;
                            y2 = y + height;
                            shifted = true;
                        }
                    }
                    if (shifted) System.out.println("New coordinates: x=" + x + ", y=" + y);

                    myShapes[i] = new Box(width, height, depth);
                    myGroup.getChildren().add(myShapes[i].draw(x, y));

                    Box shape = (Box) myShapes[i];
                    text.setText(String.format("Area = %.2f\nVolume = %.2f", shape.calcArea(), shape.calcVolume()));

                    // Keep text visible (below shape, but inside scene)
                    text.setX(Math.max(10, x));
                    text.setY(Math.min(sceneHeight - 20, y + height + 30));

                    myGroup.getChildren().add(text);

                    occupiedAreas[occupiedCount++] = new int[]{x1, y1, x2, y2};

                    if (x2 + 50 > sceneWidth) sceneWidth = x2 + 50;
                    if (y2 + 50 > sceneHeight) sceneHeight = y2 + 50;
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