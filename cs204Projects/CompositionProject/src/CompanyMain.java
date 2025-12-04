// main method to test classes - Company, Employee & Date

//import java.util.Scanner;
public class CompanyMain {
	public static void main(String [] args) {
		//Scanner input = new Scanner(System.in);
		
		try {
		   Date birthDate = new Date(7, 24, 1949);
		   Date hireDate = new Date(3, 12, 1988);
		   
		   Date birthDate2 = new Date(8, 30, 1969);
		   Date hireDate2 = new Date(2, 28, 1990);
		   
		   Employee emp1 = new Employee("Bob", "Blue", birthDate, hireDate);
		   Employee emp2 = new Employee("Jane", "White", birthDate2, hireDate2);
		   
		   Company company1 = new Company(2, "Sun Corp");
		   company1.addEmployee(emp1);
		   company1.addEmployee(emp2);
		   System.out.print(company1);

	   } 
	   catch (IllegalArgumentException e) {
		   System.out.printf("%s%n", e.getMessage());
	   }
	   System.out.print("\n\nProgram Finished.");
	   } 
	}


