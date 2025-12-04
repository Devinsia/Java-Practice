// Activity 2: Mathematical Functions

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Enter x as a float number: ");
		x = input.nextDouble();
		
		if (x > 0) { y = 5*x - 3; }
		else if (x == 0) { y = 8; }
		else { y = 5/x + 1; }
		
		System.out.printf("y = %.2f", y);
		
		input.close();
	}
}