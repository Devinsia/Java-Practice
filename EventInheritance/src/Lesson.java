// Inherits from Event class (IS-A relationship)
// Has Person objects as data members (HAS-A relationship)

public class Lesson extends Event {
	private String courseName;
	private Person instructor;
	
	// ---------- Constructor
	public Lesson( String startDate, String endDate, String location,
			String courseName, Person instructor) {
		
		super(startDate, endDate, location);
		setInstructor(instructor);
		setCourseName(courseName);
	}
	
	// ---------- Setters
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setInstructor(Person instructor) {
		this.instructor = instructor;
	}
	
	// ---------- Getters
	public String getCourseName() {
		return courseName;
	}
	
	public Person getInstructor() {
		return instructor;
	}
	
	// ---------- Overridden toString
	@Override
	public String toString() {
		return String.format("Course name: %s%n%sInstructor: %s", courseName,
				super.toString(), instructor);
	}
	
	/*
	public static void main(String [] args) {
		Person pObject = new Person("Kevin", "carter", "999-999-9999");
		Lesson object = new Lesson("09/02/2002", "09/02/2002","S320", "Algo Prob Sol ||",   pObject);
		
		System.out.print(object);
	}
	*/
}
