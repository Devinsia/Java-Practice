// main method for testing functions in CourseGrade and Student Classes

// import java.util.Scanner;

public class StudentCourseGradeMain {

	public static void main(String[] args) {

		//---------- Course Grade Object 1
		
		//System.out.print("Object 1 ~ \n");
		CourseGrade course1 = new CourseGrade("CS204", 2, 2);
		
		// setting assignment grades
		course1.setAssignmentGrade(0,80);
		course1.setAssignmentGrade(1,90);
		
		// setting exam grades
		course1.setExamGrade(0,78);
		course1.setExamGrade(1,75);
		
		//System.out.print(course1);
		
		// ---------- Course Grade Object 2
		
		//System.out.print("Object 2 ~ \n");
		CourseGrade course2 = new CourseGrade("CS220", 2, 2);
		
		// setting assignment grades
		course2.setAssignmentGrade(0,80);
		course2.setAssignmentGrade(1,90);
		
		// setting exam grades
		course2.setExamGrade(0,100);
		course2.setExamGrade(1,80);
		
		//System.out.print(course2);
		
		// ---------- Student Object
		
		Student student1 = new Student("John Doe", "124532323", "Computer Science", 2);
		
		student1.setCourseGrade(0, course1);
		student1.setCourseGrade(1, course2);
		
		System.out.print(student1);
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("Object 1 ~ \n");
		CourseGrade course1 = new CourseGrade("CS 204", 2, 2);
		
		for(int i = 0; i < course1.numberOfAssignments(); i++) {
			System.out.printf("Enter assignments %d grade (0-100): ", (i+1));
			// double grade = input.nextDouble();
			course1.setAssignmentGrade(i,  input.nextDouble());
		}
		
		System.out.print("\n");
		
		for(int i = 0; i < course1.numberOfExams(); i++) {
			System.out.printf("Enter exams %d grade (0-100): ", (i+1));
			// double grade = input.nextDouble();
			course1.setExamGrade(i,  input.nextDouble());
		}
		
		// Printing assignment grades
		System.out.print("\nAssignment grades : ");
		
		for(int i = 0; i < course1.numberOfAssignments(); i++) {
			System.out.printf("%.2f ",course1.getAssignmentGrade(i));
		}
		
		// Printing exam grades
		System.out.print("\nExam grades : ");
		
		for(int i = 0; i < course1.numberOfExams(); i++) {
			System.out.printf("%.2f ",course1.getExamGrade(i));
		}
		
		System.out.print("\n\n");
		// 
		input.close();
		
		*/
	
	}

}
