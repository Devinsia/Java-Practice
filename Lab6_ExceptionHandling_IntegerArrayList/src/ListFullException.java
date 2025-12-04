
public class ListFullException extends IntegerListException{

	public ListFullException(String message) {
		super("ListFullException: " + message);
	}
	
	public ListFullException(String message, Throwable obj) {
		super("ListFullException: "+ message, obj);
	}
	
}
