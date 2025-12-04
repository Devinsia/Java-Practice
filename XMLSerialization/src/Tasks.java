import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Tasks {
	@XmlElement(name = "task")
	private List <Task> myTasks = new ArrayList<>();
	
	public List<Task> getMyTasks() {return myTasks;}
	

}
