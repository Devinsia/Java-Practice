import java.util.Scanner; // input uses class Scanner

public class Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*double n1, n2, s;
		
		System.out.print("Enter a double: ");
		n1 = input.nextDouble();
		
		System.out.print("Enter another double: ");
		n2 = input.nextDouble();
		
		System.out.print("Enter a float: ");
		float n3 = input.nextFloat();
		
		s = n1 + n2 + n3;
		System.out.printf("Sum is %.3f%n", s);
		
		input.nextLine();
		
		// Read in strings
		 System.out.print("What is your first name?: ");
		String myFName = input.next();
		System.out.print("What is your last name?: ");
		String myLName = input.next();
		System.out.println(myFName + " " + myLName);
		
		System.out.print("What is your name?: ");
		String myName = input.nextLine();
		System.out.println(myName);
		
		
		
		// Activity: Sum, Product, Average of Floats
		
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
		*/
		
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
