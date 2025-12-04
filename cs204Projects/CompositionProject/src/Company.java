// Activity: Company HAS-A Employees HAS-A Dates

public class Company {
	private String companyName;
	private Employee[] employeeList;
	private int numEmployees;
	
	// constructor to initialize company name and employee list array
	public Company(int numEmployees, String companyName) {
		employeeList = new Employee[numEmployees];
		this.companyName = companyName;
	}
	
	// add employees to array if space available
	public void addEmployee(Employee obj) {
			
		if(numEmployees < employeeList.length) {
			employeeList[numEmployees] = obj;
			numEmployees++;
		}else {
			System.out.print("Array is full");
		}
	}
	
	// return company and employees in String format
	public String toString() {
		String allString = String.format("Company Name: %s", companyName);
		for (int i = 0; i < numEmployees; i++) {
			//allString += "Employee \n";
			allString += String.format("%nEmployee %d:%n%s",i+1, employeeList[i]);
		}
		return allString;
	}
	
}
