package application;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.xml.bind.JAXB;

public class CreateXML {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try(BufferedWriter writer = Files.newBufferedWriter(Paths.get("library.xml"))){
			
			Library myLibrary = new Library();
			System.out.println("Enter title, author, year.\r\n"
					+ "Enter end-of-file indicator to end input.\r\n"
					+ "?");
			
			while(input.hasNext()) {
				myLibrary.getBooks().add(new Book(input.nextLine(), input.nextLine(), input.nextInt()));
				
				System.out.print("? ");
				input.nextLine();
			}
			// to write into the XML file
			JAXB.marshal(myLibrary, writer);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		input.close();
		

	}

}
/*
A Tale of Two Cities
Charles Dickens
1867
? Pride and Prejudice
Jane Austin
1856
? Alice in Wonderland
Lewis Caroll
1899
*/