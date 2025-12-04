import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	
	public static void main( String [] args) {
		
		Scanner input = new Scanner(System.in);
		try (Formatter output = new Formatter(new FileWriter("clients.txt", true))) {
			
			System.out.print("Enter account no, firstname, lastname, balance ");
			while(input.hasNext()) {
				
				try {
					output.format("%d %s %s %.2f%n",  input.nextInt(), input.next(),
							input.next(), input.nextDouble());
				} catch (NoSuchElementException e){
					e.printStackTrace();
					input.nextLine();
				}
				System.out.print("? "); // for next input
				
			}
			
		}catch (SecurityException | FormatterClosedException | 
				 IOException exp) {
			exp.printStackTrace();
			
		}	
		// once the try block is finished the file is closed
		// if we just want to create and write to a file, not append or change the file
		/*
		try(Formatter output = new Formatter("clients.txt")){
		 
			
			System.out.print("Enter account no, firstname, lastname, balance ");
			while(input.hasNext()) {
				
				try {
					output.format("%d %s %s %.2f%n",  input.nextInt(), input.next(),
							input.next(), input.nextDouble());
				} catch (NoSuchElementException e){
					e.printStackTrace();
					input.nextLine();
				}
				System.out.print("? "); // for next input
				
			}
			
		}catch (SecurityException | FileNotFoundException | 
				FormatterClosedException exp) {
			exp.printStackTrace();
		}
		// finish running Ctrl+z and it will create a txt file in you project folder in workspace
		*/

		input.close(); // closing the keyboard stream
		
	}
}


