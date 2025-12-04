
public class IntegerListException extends Exception {
	
	public IntegerListException(String message) {
		super("IntegerListException: " + message);
	}
	
	public IntegerListException(String message, Throwable obj) {
		super("IntegerListException: " + message, obj);
	}
	
}
