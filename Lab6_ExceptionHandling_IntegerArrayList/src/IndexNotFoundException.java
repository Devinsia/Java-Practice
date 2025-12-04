
public class IndexNotFoundException extends IntegerListException {
	
	public IndexNotFoundException(String message) {
		super("IndexNotFoundException: "+ message);
	}
	
	public IndexNotFoundException(String message, Throwable obj) {
		super("IndexNotFoundException: "+ message, obj);
	}
}
