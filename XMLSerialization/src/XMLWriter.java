import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXB;

public class XMLWriter {
	public static void main (String[] args) {
		Tasks tasks = new Tasks ();
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("tasks.xml"))) {
			tasks.getMyTasks().add(new Task (1, "10:00AM-11:00AM", "Office Hour"));
			tasks.getMyTasks().add(new Task (2, "02:00PM-03:00PM", "Study Session"));
			tasks.getMyTasks().add(new Task (3, "05:30PM-07:00PM", "Dinner Preparation"));
			
			JAXB.marshal(tasks, writer);
			
		} catch (IOException exp) {exp.printStackTrace();}
	}

}
