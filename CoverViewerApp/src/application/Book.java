package application;

public class Book {
	private String title;
	private String thumbImage;
	private String largeImage;
	
	public Book(String title, String thumbImage, String largeImage) {
		setTitle(title);
		setThumbImage(thumbImage);
		setLargeImage(largeImage);
	}
	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }
	
	public void setThumbImage( String thumbImage) { this.thumbImage = thumbImage; }
	public String getThumbImage() { return thumbImage; }
	
	public void setLargeImage(String largeImage) { this.largeImage = largeImage; }
	public String getLargeImage() { return largeImage; }
	
	public String toString() { return getTitle(); }
	
}
