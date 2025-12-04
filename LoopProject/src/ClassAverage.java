import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		
		int grade, total=0, gradeCounter=0, average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a grade between 0-100:");
		while (input.hasNext()){
			grade = input.nextInt();
			total += grade;
			gradeCounter++;
			System.out.print("Enter a grade between 0-100: ");
		}
		if (gradeCounter > 0 ) {
			average = total / gradeCounter;
			System.out.printf("%nAverage of %d grades is %d%n", gradeCounter, average);
		}
		else System.out.println("\nNo grades were entered!");
		
		input.close();

	}
}