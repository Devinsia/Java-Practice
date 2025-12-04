// Student Course Grade Case Study

import java.util.Scanner;

public class CourseGrade {
	private String courseId;
	private double [] assignments;
	private double [] exams;
	
	// ------------- Constructors
	
	public CourseGrade(String courseId, int numAssignments, int numExams) {
		
		this.courseId = courseId;
		
		if (numAssignments <= 0)
			throw new IllegalArgumentException("Number of assignments should be positive");
		if (numExams <=0)
			throw new IllegalArgumentException("Number of exams should be positive");
		
		assignments = new double[numAssignments];
		exams = new double[numExams];
	
	}
	
	public CourseGrade(String courseId) {
		this(courseId, 5, 3);	// calling another constructor using "this"
	}
	
	// -------------  set and get function for courseId
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	// ------------- 
	
	public void setAssignmentGrade(int ix, double grade) {
		if (ix < 0 || ix >= assignments.length)
			throw new ArrayIndexOutOfBoundsException("Index position is out of bounds");
		if (grade < 0 || grade >100)
			throw new IllegalArgumentException("Grades must be between 0-100");
		
		assignments[ix] = grade;
	}
	
	public double getAssignmentGrade(int ix) {
		if (ix < 0 || ix >= assignments.length)
			throw new ArrayIndexOutOfBoundsException("Index position is out of bounds");
		return assignments[ix];
	}
	
	// ------------- 
	
	public void setExamGrade(int ix, double grade) {
		if (ix < 0  || ix >= exams.length)
			throw new ArrayIndexOutOfBoundsException("index position is out of bounds");
		if (grade < 0 || grade >100)
			throw new IllegalArgumentException("Grades must be between 0-100");
		
		exams[ix] = grade;
	}
	
	public double getExamGrade(int ix) {
		if (ix < 0 || ix >= exams.length)
			throw new ArrayIndexOutOfBoundsException("Index position is out of bounds");
		return exams[ix];
	}
	
	// ------------- 
	
	public void setAssignmentGrades(double [] grades) {
		if (grades.length != assignments.length)
			throw new ArrayIndexOutOfBoundsException("Index position out of bounds");
		for(int i = 0; i < assignments.length; i++) {
			assignments[i] = grades[i];
		}
	}
	
	public void setExamGrades(double [] grades) {
		if (grades.length != exams.length)
			throw new ArrayIndexOutOfBoundsException("Index position out of bounds");
		for(int i = 0; i < exams.length; i++) {
			exams[i] = grades[i];
		}
	}
	
	// ------------- length of arrays assignments and exams
	
	public int numberOfAssignments() {
		return assignments.length;
	}
	
	public int numberOfExams() {
		return exams.length;
	}
	
	// ------------- get number grade
	
	public double getAverageGrade() {
		double sumAssignments = 0.0;
		double sumExams = 0.0;
		
		for(int i =0; i < assignments.length; i++) {
			sumAssignments += assignments[i];
		}
		
		for(int i = 0; i < exams.length; i++) {
			sumExams += exams[i];
		}
		
		double averageAssignmentGrade = sumAssignments/assignments.length;
		double averageExamGrade = sumExams/exams.length;
		
		return averageAssignmentGrade*0.4 + averageExamGrade*0.6;
		
	}
	
	// ------------- convert number grade to letter grade
	
	public String getLetterGrade() {
		double grades = getAverageGrade();
		if (grades > 90)
			return "A";
		else if (grades >80)
			return "B";
		else if (grades > 70)
			return "C";
		else if (grades > 60)
			return "D";
		else
			return "F";		
	}
	
	// ------------- override inherited toString function 
	
	public String toString() {
		return String.format("Course ID: %s%nGrade: %.0f -> %s", courseId, getAverageGrade(), getLetterGrade());
	}
	
	// ------------- main function to test the CourseGrade functions
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CourseGrade course = new CourseGrade("CS 204", 2, 2);
		
		for(int i = 0; i < course.numberOfAssignments(); i++) {
			System.out.printf("Enter assignments %d grade (0-100): ", (i+1));
			// double grade = input.nextDouble();
			course.setAssignmentGrade(i,  input.nextDouble());
		}
		
		System.out.print("\n");
		
		for(int i = 0; i < course.numberOfExams(); i++) {
			System.out.printf("Enter exams %d grade (0-100): ", (i+1));
			// double grade = input.nextDouble();
			course.setExamGrade(i,  input.nextDouble());
		}
		
		System.out.print("\nAssignment grades : ");
		
		for(int i = 0; i < course.numberOfAssignments(); i++) {
			System.out.printf("%.2f ",course.getAssignmentGrade(i));
		}
		
		System.out.print("\nExam grades : ");
		
		for(int i = 0; i < course.numberOfExams(); i++) {
			System.out.printf("%.2f ",course.getExamGrade(i));
		}
		
		System.out.print("\n\n");
		System.out.println(course);
		input.close();
	}
	
}
