package application;

public class GraduateStudent extends Student{

	public GraduateStudent(String name, String id, CourseGrade[] courses) {
		super(name, id, courses);
	}

	@Override
	public double calculateGPA() {
		
		double gpa = 0;
		CourseGrade [] temp = getCourses();
		
		for(int i = 0;  i < temp.length; i++) {
			if (temp[i].getLetterGrade() == "A")
				gpa += 4.0;
			if (temp[i].getLetterGrade() == "B")
				gpa += 3.5;
			if (temp[i].getLetterGrade() == "C")
				gpa += 3.0;
			if (temp[i].getLetterGrade() == "D")
				gpa += 2.5;
			if (temp[i].getLetterGrade() == "E")
				gpa += 2.0;
		}
		
		gpa /= temp.length;
		return gpa;
	}

	public static void main(String [] args) {
		CourseGrade [] courses = new CourseGrade[2];
		courses[0] = new CourseGrade("Algo Prob Solve I", "CS101","A");
		courses[1] = new CourseGrade("Algp Prob Solve II", "CS204", "B");
		Student s = new GraduateStudent("JZ z", "111", courses);
		System.out.println(s.calculateGPA());
		
	}
}
