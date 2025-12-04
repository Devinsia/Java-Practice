// Activity 1 : Sum, Product, Average of Floats

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float num1, num2, num3;
		double  sum, product, average;
		
		System.out.println("Enter three float values:");
		num1 = input.nextFloat();
		num2 = input.nextFloat();
		num3 = input.nextFloat();
		
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		average = sum/3;
		
		System.out.printf("Sum: %.2f%nProduct: %.2f%nAverage: %.2f%n", sum, product, average);
		
		input.close();
	}
}
