package application;

public class CourseGrade {
	private String courseName;
	private String courseCode;
	private String letterGrade;
	
	public CourseGrade(String courseName, String courseCode, String letterGrade) {
		setCourseName(courseName);
		setCourseCode(courseCode);
		setLetterGrade(letterGrade);
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getLetterGrade() {
		return letterGrade;
	}
	
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - Grade: %s", getCourseCode(), 
				getCourseName(), getLetterGrade());
	}

}
