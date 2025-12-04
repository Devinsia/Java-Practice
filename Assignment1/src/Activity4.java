import java.util.Scanner;

// Activity: Shopping Basket

public class Activity4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] basket = new String[20];
		
		int arrayCounter = 0;
		double totalCost = 0;
		double costPerItem = 0;
		int numItems = 0;
		String itemName;
		
		System.out.print("Enter item name: ");
		itemName = input.next();
		
		while(!itemName.equals("quit") && arrayCounter < basket.length ) {
			
			basket[arrayCounter] = itemName;
			System.out.print("Enter item count and cost per item: ");
			
			numItems = input.nextInt();
			costPerItem = input.nextDouble();
			
			totalCost += (numItems*costPerItem);
			
			System.out.print("Enter item name: ");
			itemName = input.next();
			
			arrayCounter++;
			
		}
		
		for (int counter = 0; counter < arrayCounter; counter++) {
			System.out.printf("%s ",basket[counter]);
		}
		System.out.printf("%nTotal Cost: %.2f", totalCost);
			
		input.close();
	}

}
