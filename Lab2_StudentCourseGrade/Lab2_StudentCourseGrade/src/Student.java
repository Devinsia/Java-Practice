public class Student {
	
	// ------------ Instance Variables
	private String name;
	private String studentId;
	private String major;
	private CourseGrade [] cGrades;
	
	// ------------ Constructor
	public Student( String name, String studentId, String major, int numCourses) {
		this.name = name;
		this.studentId = studentId;
		this.major = major;
		
		if (numCourses <= 0)
			throw new IllegalArgumentException("Number of courses have to be positive");
		
		cGrades = new CourseGrade[numCourses];
	}
	
	// ------------ setter and getter for name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// ------------ setter and getter for studentId
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	// ------------ setter and getter for major
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getmajor() {
		return major;
	}
	
	// ------------ setter and getter for cGrade
	public void setCourseGrade(int ix, CourseGrade cGrade) {
		if (ix < 0 || ix >= cGrades.length)
			throw new ArrayIndexOutOfBoundsException("Index position is put of bounds");
		cGrades[ix]= cGrade;	
	}
	
	public CourseGrade getCourseGrade(int ix) {
		if (ix <0 || ix >= cGrades.length)
			throw new ArrayIndexOutOfBoundsException("Index position is put of bounds");
		return cGrades[ix];
	}
	
	// ------------ override inherited toString function for our custom class
	public String toString() {
		String allString = String.format("Name: %s%nId: %s%nMajor: %s%n", name, studentId, major);
		for(int i = 0; i< cGrades.length; i++) {
			allString += String.format("%s%n",cGrades[i]);
		}
		return allString;	
	}
}
