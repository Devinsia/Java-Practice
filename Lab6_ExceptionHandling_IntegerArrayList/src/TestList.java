
public class TestList {

	public static void main(String[] args) {
		
		System.out.println("--------try-catch error 1--------");
		try {
			IntegerArrayList obj = new IntegerArrayList(0);
		}catch (Exception e) {
			System.out.printf("Error: %s%n", e.getMessage());
		}
		
		
		System.out.println("\n--------try-catch error 2--------");
		try {
			IntegerArrayList obj = new IntegerArrayList(1);
			obj.firstElement();
		}catch (ListEmptyException e) {
			System.out.printf("Error: %s%n", e.getMessage());
		}
		
		System.out.println("\n--------try-catch error 3--------");
		try {
			IntegerArrayList obj = new IntegerArrayList(1);
			obj.add(555);
			obj.add(444);
		}catch (ListFullException e) {
			System.out.printf("Error: %s%n", e.getMessage());
		}
		
		System.out.println("\n--------try-catch error 4--------");
		try {
			IntegerArrayList obj1 = new IntegerArrayList(2);
			obj1.add(555);
			obj1.add(444);
			obj1.indexOf(666);
		}
		catch (ListEmptyException e) {
			System.out.printf("Error: %s%n", e.getMessage());
		}
		catch (ValueNotFoundException e1) {
			System.out.printf("Error: %s%n", e1.getMessage());
		}
		catch (ListFullException e2) {
			System.out.printf("Error: %s%n", e2.getMessage());
		}
		
		
		System.out.println("\n--------try-catch error: multiple catch block reverse hierarchy--------");
		try{
			
			// create IntegerArrayList obj 
			// call the methods
			
			IntegerArrayList obj = new IntegerArrayList(5);
			
			
			System.out.print("\n");
			obj.add(555);
			obj.add(444);
			obj.add(333);
			System.out.println("first object: " + obj.firstElement());
			//obj.add(111);
			System.out.println("value at index 3: ");
			System.out.print(obj.valueAt(3));
			
			
		} // catch blocks follow the exception hierarchy and only throws first exception caught
		catch (IndexNotFoundException e){ // subclass
			System.out.printf("Error: %s%n", e.getMessage());
		}
		catch(IntegerListException e2) { // superclass
			System.out.printf("Error: %s%n", e2.getMessage());
		}
		catch(Exception e3) { // super superclass
			System.out.printf("Error: %s%n", e3.getMessage());
		}

	}
	

}
