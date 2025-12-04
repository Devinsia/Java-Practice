import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numOfCars;
		
		System.out.print("Enter the number of cars in inventory: ");
		numOfCars = input.nextInt();
		input.nextLine();
		
		Automobile[] vehicles = new Automobile[numOfCars];
		
		for (int i = 0; i< numOfCars; i++) {
			
			System.out.print("\nEnter the make of the car: ");
			String make = input.nextLine();
			System.out.print("Enter the model of the cars: ");
			String model = input.nextLine();
			System.out.print("Enter the year of the car: ");
			int year = input.nextInt();
			System.out.print("Enter the price of the car: ");
			double price = input.nextDouble();
			
			input.nextLine();
			vehicles[i] = new Automobile(make, model, year, price);	
		}
		
		while(true) {
			int index;	
			System.out.print("\nEnter a car index to display: ");
			index = input.nextInt();
			
            if (index == -1) {
                System.out.println("Program terminated.");
                break;
            }

            if (index >= 0 && index < numOfCars) {
            	
            	Automobile vehicle = vehicles[index];
    			System.out.printf("Make: %s%nModel: %s%nYear: %d%nPrice: %.2f%n", vehicle.getMake(), 
    					vehicle.getModel(), vehicle.getYear(), vehicle.getPrice());
    			
            } else {
                System.out.println("Invalid index.");
            }
			
		}
		
		input.close();
	}

}
