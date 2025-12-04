
public class Account {
	// instant variables/attributes
	private String name;
	private double balance;
	
	// default constructor
	public Account() {	}
	
	// Parameterized constructor
	public Account(String name) {
		this.name = name;
	}
	
	public Account(String name, double balance) {
		this.name = name;
		if(balance > 0.00)
			this.balance = balance;
	}
	
	// assessor and mutator
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance += depositAmount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double withdrawAmount) {
		if (balance > withdrawAmount)
			balance -= withdrawAmount;
		else 
			System.out.printf("Not enough money, No change in Balance.");
	}
}
