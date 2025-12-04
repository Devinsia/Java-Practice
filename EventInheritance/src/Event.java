
public class Event {
	
	// ---------- data members
	private String startDate;
	private String endDate;
	private String location;
	private static final int[] daysPerMonth = 
	      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	
	// ---------- utility functions
	// check format of date MM/DD/YYYY
	private boolean checkDateFormat(String date) {
		
		if (date.length() != 10)
				return false;
		
		for(int i = 0; i < date.length() ; i++) {	
			if ((i == 2 || i == 5) && date.charAt(i) != '/' )
				return false;
			else if ( (!(i == 2 || i == 5)) &&  (date.charAt(i) < '0' || date.charAt(i) > '9'))
				return false;
			
		}	
		
		return true;
	}
	
	// Check if m, d, y are valid
	private boolean checkDate(String date) {
		
		if( !checkDateFormat(date))
			return false;
		
		String month = date.substring(0, 2);
		String day = date.substring(3, 5);
		String year = date.substring(6,10);
		
		// create integer objects from the integer class
		// use Integer class constructor, then use intValue o get primitive int type not Integer
		int m = new Integer(month).intValue();
		int d = new Integer(day).intValue();
		int y = new Integer(year).intValue();
		
		//System.out.printf("%d/%d/%d%n ", m, d, y);
		
		// check if month in range
	    if (m <= 0 || m > 12) 
	    	return false;

	      // check if day in range for month
	    if (d <= 0 || 
	         (d > daysPerMonth[m] && !(m == 2 && d == 29))) 
	    	return false;

	      // check for leap year if month is 2 and day is 29
	    if (m == 2 && d == 29 && !(y % 400 == 0 || 
	           (y % 4 == 0 && y % 100 != 0))) 
	    	return false;
	   
	      
		return true;
	}
	
	// ---------- Constructor
	public Event(String startDate, String endDate, String location) {
		setStartDate(startDate);
		setEndDate(endDate);
		setLocation(location);
	}
	
	// ---------- Setters
	public void setStartDate(String startDate) {
		if( !checkDate(startDate))
			throw new IllegalArgumentException("Start date format is wrong (MM/DD/YYYY");
		this.startDate = startDate;
	}
	
	public void setEndDate(String endDate) {
		if( !checkDate(endDate))
			throw new IllegalArgumentException("End date format is wrong (MM/DD/YYYY");
		this.endDate = endDate;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	// ---------- Getters
	public String getStartDate() {
		return startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public String getLocation() {
		return location;
	}
	
	// ---------- toString function
	public String toString() {
		return String.format("Start Date: %s%nEndDate: %s%nLocation: %s%n", 
				startDate, endDate, location);
	}
	
	/*
	public static void main(String []args ) {
		Event object = new Event("10/24/1234", "10/02/2022", "S-234");
		System.out.print(object);
	}
	*/
}
