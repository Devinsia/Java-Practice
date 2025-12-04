// Testing Account class
// what if the user enters a negative amount (add code for that)

import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		
		// account1.name = "Iman Z";
		Scanner input = new Scanner(System.in);
		
		System.out.print("-------Testing using parameterized constructor-------\n\n");
		// constructor
		Account account1 = new Account("Miyo Kai", 43.57);
		Account account2 = new Account("Zu Mo", 9403);		
		
		// getFunctions 
		System.out.printf("The owner of the first account is %s.%n", account1.getName() );
		System.out.printf("Balance: %.2f%n%n", account1.getBalance());
		System.out.printf("The owner of the second account is %s.%n", account2.getName() );
		System.out.printf("Balance: %.2f%n", account2.getBalance());
		
		
		System.out.print("\n-------Testing using default constructor-------\n\n");
		
		Account account3 = new Account();
		
		// Before using setFunctions
		
		System.out.print("Before using setFunctions:");
		System.out.printf("\nThe owner of the third account is %s.%n", account3.getName() );
		System.out.printf("Balance: %.2f%n%n", account3.getBalance());
		
		// setFunctions 
		
		//After using setFunctions
		
		System.out.print("After using setFunctions");
		System.out.print("\nEnter account owners name: ");
		String localName = input.nextLine();
		account3.setName(localName);
		
		System.out.print("Enter deposit amount: ");
		double amount = input.nextDouble();
		account3.deposit(amount);
		input.nextLine();
		
		System.out.printf("\nThe owner of the third account is %s.%n", account3.getName() );
		System.out.printf("Balance: %.2f%n", account3.getBalance());
		
		// -----------------------
		
		System.out.print("\n-------Testing using constructor (one parameter) -------\n\n");
		
		Account account4 = new Account("Sui Lan");	
		
		System.out.printf("The owner of the fourth account is %s.%n", account4.getName() );
		System.out.print("Enter deposit amount: ");
		amount = input.nextDouble();
		account4.deposit(amount);
		//input.nextLine();
		
		// getFunctions
		System.out.printf("\nThe owner of the fourth account is %s.%n", account4.getName() );
		System.out.printf("Balance: %.2f%n", account4.getBalance());
		
		// Testing withdraw function
		System.out.print("\n-------Testing withdraw function -------\n\n");
		
		System.out.printf("Enter an amount to widraw from %s: ", account1.getName());
		amount = input.nextDouble();
		account1.withdraw(amount);
		System.out.printf("\nBalance: %.2f%n", account1.getBalance());
		
		System.out.printf("\nEnter an amount to widraw from %s: ", account2.getName());
		amount = input.nextDouble();
		account2.withdraw(amount);
		System.out.printf("Balance: %.2f%n", account2.getBalance());
		
		input.close();
		
	}

}
