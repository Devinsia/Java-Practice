import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExerciseFromPPTFileCreation {
	public static void main( String [] args) throws IOException {
		Scanner input = new Scanner(System.in);
		try(Formatter output = new Formatter("tasks.txt")){
		 
			
			System.out.print("Enter task ID and time ");
			while(input.hasNext()) {
				
				try {
					output.format("%d %s %s%n",  input.nextInt(), input.next(),
							input.nextLine());
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
		input.close(); 		
		//input.nextLine();
		/*
		Scanner input1 = new Scanner(System.in);
		System.out.print("\n\n");
		System.out.println("Enter file name:");
		String filePath = input1.next();
		Path path = Paths.get(filePath);
		input1.close();
		
		if (Files.exists(path) &&  !(Files.isDirectory(path)) )
		{
			System.out.printf("%n%s absolutepath%n", Files.size(path));
			System.out.print("\n\n");

			try(Scanner input11 = new Scanner( Paths.get("tasks.txt"))){
				System.out.printf("%-8s%-17s%13s%n", "ID", 
						"Time", "Description");
				
				while(input11.hasNext()) {
					System.out.printf("%-8d%-17s%15s%n", input11.nextInt(), 
							input11.next(), input11.nextLine());
				}
				
			} catch(IOException | NoSuchElementException | IllegalArgumentException exp) {
				exp.printStackTrace();
			}
		}
		
		*/
		
	}
}
// 1 11:00Am-11:30AM Review class materials
// 2 2:00PM-3:00PM Attend office hours