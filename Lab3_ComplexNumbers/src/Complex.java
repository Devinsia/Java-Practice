// Case Study 3 - Static Methods
// Complex Numbers

import java.util.Scanner;

public class Complex {
	// instance variables
	private double real;
	private double imaj;
	
	// Constructor
	public Complex(double real, double imaj) {
		this.real = real;
		this.imaj = imaj;
	}
	
	// static method deals with parameter object of same type
	
	// add 2 complex objs and create a new complex obj
	public static Complex add(Complex c1, Complex c2) {
		return new Complex( c1.real + c2.real, c1.imaj +c2.imaj );
	}
	
	// subtract 2 complex objs and create a new complex obj
	public static Complex subtract(Complex c1, Complex c2) {
		return new Complex(c1.real - c2.real , c1.imaj-c2.imaj);
	}
	
	// multiply 2 complex objs and create a new complex obj
	public static Complex multiply(Complex c1, Complex c2) {
		return new Complex( (c1.real*c2.real)-(c1.imaj*c2.imaj),  
					(c1.real*c2.imaj)+(c1.imaj*c2.real));
	}
	
	// divide 2 complex objs and create a new complex obj
	public static Complex divide(Complex c1, Complex c2) {
		return new Complex( (c1.real*c2.real + c1.imaj*c2.imaj) / 
						    (c2.real*c2.real + c2.imaj*c2.imaj) ,
						    (c1.imaj*c2.real - c1.real*c2.imaj) / 
						    (c2.real*c2.real + c2.imaj*c2.imaj) );
	}
	
	
	// override toString function for our custom class
	public String toString() {
		return String.format("%.2f, %.2f", real, imaj);
	}
	
	// main function for testing
	public static void  main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		double r1=0, i1=0, r2=0, i2=0;
		String operator = " ";
		
		System.out.print("Enter your first complex number with a space in between\n"
				+ "   then enter one operator (+, -, *, or /)\n"
				+ "   then enter the second complex number with space in between:\n"
				+ "   it should be in the form ~ 3 3.2 + 4 5.6   ----- or (ctrl+Z to quit)\nInput = ");
		r1 = input.nextDouble();
		
		while (input.hasNext()) {

			i1= input.nextDouble();			
			operator = input.next();	
			r2= input.nextDouble();
			i2= input.nextDouble();
			
			Complex number1 = new Complex(r1, i1);
			Complex number2 = new Complex(r2, i2);
			
			if (operator.equals("+")) {
				Complex addNumber = Complex.add(number1, number2);
				System.out.printf("(%s) + (%s) = (%s)%n", number1, number2, addNumber);
			}
			else if (operator.equals("-")) {
				Complex subtractNumber = Complex.subtract(number1, number2);
				System.out.printf("(%s) - (%s) = (%s)%n", number1, number2, subtractNumber);
			}
			else if (operator.equals("*")) {
				Complex multiplyNumber = Complex.multiply(number1, number2);
				System.out.printf("(%s) * (%s) = (%s)%n", number1, number2, multiplyNumber);
			}
			else if ( operator.equals("/")) {
				Complex divideNumber = Complex.divide(number1, number2);
				System.out.printf("(%s) / (%s) = (%s)%n", number1, number2, divideNumber);
			}
			
			System.out.print("\nEnter your first complex number with a space in between\n"
					+ "   then enter one operator (+, -, *, or /)\n"
					+ "   then enter the second complex number with space in between:\n"
					+ "   it should be in the form ~ 3 3.2 + 4 5.6  ----- or (ctrl+Z to quit)\nInput = ");
			r1 = input.nextDouble();
		}

		
		// regular methods will be called with object names
		// static method will be called by the class name
		
		input.close();
		
	}
}


/*  Example Output

Enter your first complex number with a space in between
   then enter one operator (+, -, *, or /)
   then enter the second complex number with space in between:
   it should be in the form ~ 3 3.2 + 4 5.6   ----- or (ctrl+Z to quit)
Input = 3.4 5.6 + 12.1 -5.1
(3.40, 5.60) + (12.10, -5.10) = (15.50, 0.50)

Enter your first complex number with a space in between
   then enter one operator (+, -, *, or /)
   then enter the second complex number with space in between:
   it should be in the form ~ 3 3.2 + 4 5.6  ----- or (ctrl+Z to quit)
Input = 3.4 5.6 / 12.1 -5.1
(3.40, 5.60) / (12.10, -5.10) = (0.07, 0.49)

*/
