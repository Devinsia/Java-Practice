import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExerciseFromPPTFileReading {

	public static void main(String[] args) throws IOException {
		
		Scanner input1 = new Scanner(System.in);
		//System.out.print("\n\n");
		System.out.println("Enter file name:");
		String filePath = input1.next();
		Path path = Paths.get(filePath);
		
		if (Files.exists(path) &&  !(Files.isDirectory(path)) )
		{
			System.out.printf("Absolutepath: %s%n", path.toAbsolutePath());
			System.out.print("\n");

			try(Scanner input11 = new Scanner( Paths.get(filePath))){
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
		
		input1.close(); 

	}

}
