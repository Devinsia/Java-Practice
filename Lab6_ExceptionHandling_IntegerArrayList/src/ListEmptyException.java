
public class ListEmptyException extends IntegerListException{
	
	public ListEmptyException(String message) {
		super("ListEmptyException: "+ message);
	}
	
	public ListEmptyException(String message, Throwable obj) {
		super("ListEmptyException: "+ message, obj);
	}
	
}
