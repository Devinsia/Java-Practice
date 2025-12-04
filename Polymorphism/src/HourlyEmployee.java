// must implement abstract methods from Employee
public class HourlyEmployee extends Employee {
	private double hours;
	private double wage;
	
	public HourlyEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		
		setHours(hours);
		setWage(wage);
	}
	
	public void setHours(double hours) {
		if(hours < 0)
			throw new IllegalArgumentException("hours cannot be negative");
		this.hours = hours;
	}
	
	public void setWage(double wage) {
		if(wage < 0)
			throw new IllegalArgumentException("Wage cannot be negative");
		this.wage = wage;
	}
	
	public double getHours() {
		return hours;
	}
	
	public double getWage() {
		return wage;
	}
	
	@Override
	public double earnings() {
		double pay = getHours() * getWage();
		/*
	    if (getHours() <= 40)
	      return pay;
	    else
	      return pay + (getHours() - 40) * getWage() * 0.5;
	      */
		if(getHours() > 40)
			pay += (getHours() - 40) * getWage() * 0.5;
		return pay;
	} 
	
	@Override
	public String toString() {
		return String .format("hourly %s%nHours: %.2f%nWage: %.2f",super.toString(),
				getHours(), getWage());
	}
	
}
