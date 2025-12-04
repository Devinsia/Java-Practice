import java.util.Scanner;

// Activity 3 : Matrix

public class Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for rows and columns: ");
		int N = input.nextInt();
		
		for (int row = 0; row <N; row ++)
		{
			for (int col = 0; col < N; col++)
			{
				if(col >= row) {System.out.print("1");}
				else {System.out.print("0");}
			}
			System.out.println();
		}
		input.close();
	}
}
	
