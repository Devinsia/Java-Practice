
public class IntegerArrayList {
	
	private int[] array;
	private int numElements = 0;
	
	public IntegerArrayList(int size) {
		if (size <= 0)
			throw new IllegalArgumentException("Size needs to be greater than zero");
		
		array = new int[size];
	}
	
	public void add(int value) throws ListFullException
	{
		if(numElements == array.length)
			throw new ListFullException("Array is full");
		
		array[numElements] = value;
		numElements++;
	}
	
	public int valueAt(int index) throws IndexNotFoundException
	{
		if(index < 0 || index >= numElements)
			throw new IndexNotFoundException("Index must be within the size of the array");
		
		return array[index];
	}
	
	public int firstElement() throws ListEmptyException
	{
		if(numElements == 0)
			throw new ListEmptyException("Array is empty");
		
		return array[0];
	}
	
	public int indexOf(int value) throws ListEmptyException, ValueNotFoundException
	{
		if(numElements == 0)
			throw new ListEmptyException("Array is empty");
		

	    for (int i = 0; i < numElements; i++) {
	        if (array[i] == value) {
	            return i;
	        }
	    }
	    
	    throw new ValueNotFoundException("Value not found in array");
	}
	
}
