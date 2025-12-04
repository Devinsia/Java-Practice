
public class Task {
	private int taskId;
	private String time;
	private String description;
	
	public Task () {
		this(0, "", "");
	}

	public Task(int taskId, String time, String description) {
		this.taskId = taskId;
		this.time = time;
		this.description = description;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
