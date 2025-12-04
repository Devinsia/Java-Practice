import java.util.Scanner;

public class Library {
	private Book [] books;
	private String libName; 
	private int numBooks;
	
	//define constructors
	public Library(String libName, int capacity)
	{
		//capacity must be greater than zero
		if (capacity <= 0 )
			throw new IllegalArgumentException("capacity must be greater than zero");
		
		//name must not be empty string 
		if(libName.equals(""))
			throw new IllegalArgumentException("Name cannot be empty");
		this.libName = libName;
		
		//create the books array
		books = new Book[capacity];
		
	}
	
	public Library(String theName)
	{
		//set the library name 
		//use default 100 capacity to create book array
             //Hint: use this() to call the previous constructor
		this(theName, 100);
	}
	
	//define getter for numBooks
	public int getNumBooks() {
		return numBooks;
	}
	
	public Book searchBook(String title)
	{
		//search a book by its title and return reference to the object 
		//if not found return null
		for(int i =0; i < numBooks ; i++) {
			if (title.equalsIgnoreCase(books[i].getTitle()))
				return books[i];
				
		}
		return null;
		
	}
	
	public void addBook(Book bookObject)
	{
		
		//if the capacity is reached, display a message that the capacity is reached
		//add a new book to the books array
		//increment numBooks
		if(numBooks == books.length)
			throw new IllegalArgumentException("You have reached full capacity");
		else {
			books[numBooks] = bookObject;
			++numBooks;
		}
	}
	
	public String toString()
    {
    	//return the library name, capacity, number of books and  the entire  book list.
		String allString = String.format("Library Name: %s%nCapacity: %d%nNumber of Books: %d%n%n", libName, books.length, numBooks);
		for(int i = 0; i < numBooks; i++) {
			allString += String.format("%s%n%n", books[i]);
		}
		return allString;
    
    }
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		try {
	    	//create a library named "Alexandria" with 200 books capacity
			Library library1 = new Library("Alexandria", 200);
			
	    	//Add 3 books to the library
			library1.addBook(new Book("Le Roll", "Alice", 1865));
			library1.addBook(new Book("Char Den", "Two Cities", 1967));
			library1.addBook( new Book("Jane Tin", "Prejudice", 1856));
			
			//try add another book with invalid values and catch the error
			System.out.print("Testing constructor with invalid values ~");
			try {
				library1.addBook(new Book("invalid", "", 1220));
			} catch (IllegalArgumentException e) {
				System.out.printf("%nError: %s%n%n", e.getMessage());
			}
			
			//Get a book title from user and search it
			/*
			System.out.print("Testing searchBook function ~\n");
			String UserInput;
			System.out.print("Enter book title: ");
			UserInput = input.nextLine();
			try{
				if (library1.searchBook(UserInput) == null)
					System.out.print("Books not found");
			}
			System.out.print("\n");
			*/
			
			//print entire library
			System.out.print(library1);
			
		} catch (IllegalArgumentException e) {
			System.out.printf("%nError: %s%n", e.getMessage());
		}
	}
}


