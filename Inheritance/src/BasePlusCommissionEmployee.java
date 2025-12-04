
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastname, 
			String socialSecurityNumber, double grossSales, 
		     double commissionRate, double baseSalary) {
		
		// constructors are not inherited
		// always have to define subClass constructor
		// instead of using this() you use super() to call an inherited constructor
		// super is a namesake of the other class's constructor
		super(firstName, lastname, socialSecurityNumber, grossSales, commissionRate);
		
		setBaseSalary(baseSalary);
		
	}
	
	public void setBaseSalary( double baseSalary) {
		if(baseSalary <= 0) 
			throw new IllegalArgumentException("Base salary must be positive");
		
		this.baseSalary = baseSalary;
	}
	
	public double getbaseSalary() {
		return baseSalary;
	}
	
	@Override
	public double earnings() {
							// super. allows you to call the
							// original (earnings) method of the superClass
		return baseSalary + super.earnings();
	} 
	
	@Override
	public String toString() {
		return String.format("base plus %s%nbase salary: %.2f", 
				super.toString(), baseSalary);
	}
	
	public static void main( String [] args) {
		try {
			CommissionEmployee employee1 = new CommissionEmployee("Jin", "Do",
					"111-111-1111", 5000.0, 0.45);
			
			CommissionEmployee employee3 = new CommissionEmployee("Jin", "Do",
					"111-111-1111", 5000.0, 0.45);
			
			if( employee1.equals(employee3))
				System.out.print("They are equal\n\n");
			
			BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Lan",
					"Shen", "111-111-1112", 5000.0, 0.45, 2000);
			
			System.out.print(employee1);
			System.out.printf("%nEarnings: %.2f%n%n", employee1.earnings());
			
			System.out.print(employee2);
			System.out.printf("%nEarnings: %.2f", employee2.earnings());
		} 
		catch (IllegalArgumentException e) {
			System.out.printf("%nError: %s%n", e.getMessage());
		}

		
				
	}
}
