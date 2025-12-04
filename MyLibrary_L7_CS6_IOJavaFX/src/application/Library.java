package application;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Library {
	
	@XmlElement(name = "Book") // tag for XML file
	private List<Book> books = new ArrayList<>(); //instance variable books of type List<Book>

	public List<Book> getBooks() {
		return books;
	}

	
}
