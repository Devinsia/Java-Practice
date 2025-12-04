
public class TestPolymorphism {
	public static void printEmployee(Employee emp) {
		System.out.println(emp);
		System.out.printf("Earnings: %.2f%n%n", emp.earnings());
	}
	
	public static void main(String[] args) {
		
		CommissionEmployee emp1 = new CommissionEmployee("Jane", "Doe",
				"111-11-1111", 5000, 0.5);
		
		BasePlusCommissionEmployee emp2 = new BasePlusCommissionEmployee("John",
				"Doe", "222-22-2222", 3000, 0.1, 1000);
		
		//printEmployee(emp1);
		//printEmployee(emp2);
		//System.out.println(emp1);
		//System.out.printf("Earnings: %.2f%n%n", emp1.earnings());
		
		//System.out.println(emp2);
		//System.out.printf("Earnings: %.2f%n%n", emp2.earnings());
		
		CommissionEmployee emp3 = new BasePlusCommissionEmployee("Bob", "Smith",
				"333-33-3333", 4000, 0.2, 500);
		
		//TestPolymorphism.printEmployee(emp3);
		//System.out.println(emp3);
		//System.out.printf("Earnings: %.2f%n", emp3.earnings());
		HourlyEmployee emp4 = new HourlyEmployee("Mi", "Ki", "444-44-4444", 45, 130.0);
		
		Employee [] employees = new Employee[4];
		
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
		
		for(int i = 0 ; i < employees.length; i++) {
			printEmployee(employees[i]);
			
			if(employees[i] instanceof BasePlusCommissionEmployee) {
				
				BasePlusCommissionEmployee ref = (BasePlusCommissionEmployee)employees[i];
				ref.setBaseSalary(ref.getBaseSalary()*1.1);
				
				System.out.println("Changed base salary");
				printEmployee(ref);
			}
		}
	}

}
