// Inherits from Event class (IS-A relationship)
// Has Person objects as data members (HAS-A relationship)

public class Conference extends Event {
	private String title;
	private Person speaker;
	private Person [] panelists;
	private Person moderator;
	
	// in toString , you will need for loop for panelists and super as well
	// array will come created , will not need int capacity like in other projects
	// create the array in main, initialize the contents of the array in main as
	// well as separate Persons objects
	
	// ---------- constructor
	public Conference(String startDate, String endDate, String location, 
			String title, Person speaker, Person moderator, Person [] panelists) {
		
		super(startDate, endDate, location);
		setTitle(title);
		setSpeaker(speaker);
		setPanelists(panelists);
		setModerator(moderator);
		
	}
	
	// ---------- Setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSpeaker(Person speaker) {
		this.speaker = speaker;
	}
	
	// array will come created, no need for loop addition
	public void setPanelists(Person [] panelists ) {
		this.panelists = panelists;
	}
	
	public void setModerator(Person moderator) {
		this.moderator = moderator;
	}
	
	// ---------- Getters
	public Person getModerator() {
		return moderator;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Person getSpeaker() {
		return speaker;
	}
	
	public Person[] getPanelists() {
		return panelists;
	}
	
	// ---------- Overridden toString 
	@ Override
	public String toString() {
		String allString = String.format("Title: %s%n%sSpeaker: %s%nModerator: %s%nPanelists:%n", 
				title, super.toString(),speaker, moderator);
		for(int i = 0; i < panelists.length; i++) {
			allString += String.format("%s%n",panelists[i]);
			
		}
		
		return allString;
	}
	
	// ---------- Main function ~ testing
	public static void main(String []args) {
		
		Person panelist1 = new Person("Sherlock", "Holmes", "111-111-1111");
		Person panelist2 = new Person("Esma", "Yildirim", "222-222-2222");
		Person panelist3 = new Person("Ma", "Ri", "121-121-1212");
		
		Person speakerObj = new Person("Jane", "Doe", "333-333-3333");
		Person moderatorObj = new Person("John", "Doe", "444-444-4444");
		
		Person [] panelists = {panelist1, panelist2, panelist3};
		
		Conference object = new Conference("10/01/2022", "10/03/2022", "Ender Hall",
						"Supercomputing", speakerObj, moderatorObj, panelists);
		
		System.out.print(object);
		
	}
		
}
