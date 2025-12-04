
public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	// ---------- Constructor
	public Person(String firstName, String lastName, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
	}
	
	// ---------- Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		
		if (phoneNumber.length() != 12)
			throw new IllegalArgumentException("Phone number must be 12 characters long");
		
		for (int i = 0; i < phoneNumber.length(); i++) {
			
			if ((i == 3 || i == 7) && phoneNumber.charAt(i) != '-')
				throw new IllegalArgumentException("Phone number must be in format XXX-XXX-XXXX");
			
			else if ( (!( i ==3 || i ==7)) && phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9')
				throw new IllegalArgumentException("\nPhone numbers must contain character from 0 to 9 and have "
						+ "XXX-XXX-XXXX format");
		}
		
		this.phoneNumber = phoneNumber;
	}
	
	// ---------- Getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// ---------- toString function
	public String toString() {
		return String.format("%s %s %nPhone: %s", firstName, lastName, phoneNumber);
	}
	
	/*
	public static void main(String []args) {
		Person object = new Person("Jade", "Run", "122-231-1234");
		System.out.print(object);
	}
	*/
}
