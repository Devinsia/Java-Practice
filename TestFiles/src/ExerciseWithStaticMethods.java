import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExerciseWithStaticMethods {
   /* public static void main(String[] args) throws IOException {
    	
        Scanner input = new Scanner(System.in);
        
        createAndWriteFile(input);
        readAndDisplayFile(input);
        
        input.close();
        
    }
    
    public static void createAndWriteFile() {


        try (Formatter output = new Formatter("tasks.txt")) {

            System.out.print("Enter task ID and time ");
            while (input.hasNext()) {
                try {
                    output.format("%d %s %s%n", input.nextInt(), input.next(), input.nextLine());
                } catch (NoSuchElementException e) {
                    e.printStackTrace();
                    input.nextLine(); // clear invalid input
                }
                System.out.print("? "); // prompt for next input
            }

        } catch (SecurityException | FileNotFoundException | FormatterClosedException exp) {
            exp.printStackTrace();
        }


    }


    public static void readAndDisplayFile() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter file name: ");
        String filePath = input.nextLine();
        Path path = Paths.get(filePath);

        if (Files.exists(path) && !Files.isDirectory(path)) {
            try {
                System.out.printf("%nFile size: %d bytes%n%n", Files.size(path));
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (Scanner fileReader = new Scanner(Paths.get("tasks.txt"))) {
                System.out.printf("%-8s%-17s%13s%n", "ID", "Time", "Description");

                while (fileReader.hasNext()) {
                    System.out.printf("%-8d%-17s%15s%n",
                            fileReader.nextInt(),
                            fileReader.next(),
                            fileReader.nextLine());
                }

            } catch (IOException | NoSuchElementException | IllegalArgumentException exp) {
                exp.printStackTrace();
            }

        } else {
            System.out.println("File not found or is a directory.");
        }

        input.close();
    }
    */
}
