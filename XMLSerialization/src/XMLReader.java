import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXB;

public class XMLReader {
	public static void main (String[] args) {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("Tasks.xml"))) {
			Tasks tasks = JAXB.unmarshal(reader, Tasks.class);
			System.out.printf("%-10s%-20s%20s%n", "Task ID", "Time", "Description");
			
			for (Task task : tasks.getMyTasks()) {
				System.out.printf("%-10d%-20s%20s%n", 
						task.getTaskId(), task.getTime(), task.getDescription());
			}
			
		} catch (IOException exp) {exp.getStackTrace();}
		
	}

}
