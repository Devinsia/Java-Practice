
public class ValueNotFoundException extends IntegerListException {
	
	public ValueNotFoundException(String message) {
		super("ValueNotFoundException: "+ message);
	}
	
	public ValueNotFoundException(String message, Throwable obj) {
		super("ValueNotFoundException: "+ message, obj);
	}
	
}
