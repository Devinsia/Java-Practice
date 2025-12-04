import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
	
	public static boolean isMultiple(int num1, int num2) 
							throws ArithmeticException
	{
									
		if(num1 % num2 == 0) return true;
		else return false;
	}
	
	public static void  main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		int x, y;
		

		do {
			try {
				System.out.print("Enter two integers: ");
				x = input.nextInt();
				y = input.nextInt();
				
				if(isMultiple(x,y))
					System.out.printf("%d is a multiple of %d%n", x,y);
				else System.out.printf("%d is not a multiple of %d%n", x,y);
				
				continueLoop = false;
				
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} catch(InputMismatchException e) {
				System.err.println(e.getMessage());
				input.nextLine();
				System.out.println("Please enter correct type");
			}
		} while(continueLoop);
		
		System.out.println("Program continued");
		input.close();
		
	}
	
}
