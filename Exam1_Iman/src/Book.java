public class Book {
	
	private String author;
	private String title;
	private int year;
	
	public Book(String author, String title, int year)
	{
		// called setters
		setAuthor(author);
		setTitle(title);
		setYear(year);		
	}	
	
	//constructor with no parameter
	public Book() {
		// this. is not needed because its used to differentiate between
		// the parameter and the instance variable (if they are the same)
		// here we don't have any parameter so we don't need it
		// also its easier to use this( ), no redundant code
		this.author = "";
		this.title = "No title";
		this.year = 1000;
		// this("", "No title", 1000)
	}
	
	//constructor with one parameter initializing an entire book with Book object reference 
	public Book(Book obj) {
		this(obj.author, obj.title, obj.year);
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	// added validation
	public void setTitle(String title)
	{
		if ( title.equals("") )
			throw new IllegalArgumentException("Title cannot be empty");
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	// added validation
	public void setYear(int year)
	{
		if (year < 0 || year > 2025)
			throw new IllegalArgumentException("Year must be > 0 or <= 2025");
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
    //implement a toString() method
	public String toString() {
		String allString = String.format("Author: %s%nTitle: %s%nYear: %d", author, title, year);
		return allString;
	}
	

}
