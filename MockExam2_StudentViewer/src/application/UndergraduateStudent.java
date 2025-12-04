package application;

public class UndergraduateStudent extends Student {

	public UndergraduateStudent(String name, String id, CourseGrade[] courses) {
		super(name, id, courses);
	}
	
	@Override
	public double calculateGPA() {
		
		double gpa = 0;
		CourseGrade [] temp = getCourses();
		
		for(int i = 0;  i < temp.length; i++) {
			if (temp[i].getLetterGrade() == "A")
				gpa += 4.0;
			if (temp[i].getLetterGrade() == "A-")
				gpa += 3.8;
			if (temp[i].getLetterGrade() == "B+")
				gpa += 3.6;
			if (temp[i].getLetterGrade() == "B")
				gpa += 3.4;
			if (temp[i].getLetterGrade() == "B-")
				gpa += 3.2;
			if (temp[i].getLetterGrade() == "C+")
				gpa += 3.0;
			if (temp[i].getLetterGrade() == "C")
				gpa += 2.8;
			if (temp[i].getLetterGrade() == "C-")
				gpa += 2.6;
			if (temp[i].getLetterGrade() == "D+")
				gpa += 2.4;
			if (temp[i].getLetterGrade() == "D")
				gpa += 2.2;
			if (temp[i].getLetterGrade() == "D-")
				gpa += 2.0;
			if (temp[i].getLetterGrade() == "F")
				gpa += 1.8;
		}
		
		gpa /= temp.length;
		return gpa;
	}
}
