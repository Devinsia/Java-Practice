package application;

// cannot test functions of an abstract class in main, 
// can test from a subclass of the abstract class

public abstract class Student {
	private String name;
	private String id;
	CourseGrade [] courses;
	
	public Student(String name, String id, CourseGrade[] courses) {
		super();
		this.name = name;
		this.id = id;
		this.courses = courses;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public CourseGrade[] getCourses() {
		return courses;
	}
	
	public void setCourses(CourseGrade[] courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {		
		return name;
	}
	
	public abstract double calculateGPA();
}
