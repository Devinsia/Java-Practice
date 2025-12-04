import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Comparison {
	public static void append(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i <10000000; i++)
			list.add(i);
			
		long finish = System.currentTimeMillis();
		long timeEllapsed = finish - start;
		
		if (list instanceof ArrayList<?>)
			System.out.print("ArrayList - ");
		else if( list instanceof LinkedList<?>)
			System.out.print("LinkedList - ");
		System.out.printf("Elapsed time: %d%n", timeEllapsed);
	
	}
	
	public static void insertZero(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		for(int i = 0; i <10000000; i++)
			list.add(0, i);
		
		long finish = System.currentTimeMillis();
		long timeEllapsed = finish - start;
		
		if (list instanceof ArrayList<?>)
			System.out.print("ArrayList - ");
		else if( list instanceof LinkedList<?>)
			System.out.print("LinkedList - ");
		System.out.printf("Elapsed time: %d%n", timeEllapsed);
	}

	public static void traverse(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		ListIterator<Integer> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.printf("%d ", iterator.next());
		}
		System.out.println();
		long finish = System.currentTimeMillis();
		long timeEllapsed = finish - start;
		
		if (list instanceof ArrayList<?>)
			System.out.print("ArrayList - ");
		else if( list instanceof LinkedList<?>)
			System.out.print("LinkedList - ");
		System.out.printf("Elapsed time: %d%n", timeEllapsed);
	}
	
	public static void removeRandom(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		Random generator = new Random();

		for(int j = 0; j< 100; j++) {
			//list.remove(generator.nextInt(list.size()));
			ListIterator<Integer> iterator = list.listIterator();
			int randomIndex = generator.nextInt(list.size());
			int i = 0;
			while(i<randomIndex) {
				iterator.next();
				i++;
			}
			iterator.remove();
		}
		
		long finish = System.currentTimeMillis();
		long timeEllapsed = finish - start;
		
		if (list instanceof ArrayList<?>)
			System.out.print("ArrayList - ");
		else if( list instanceof LinkedList<?>)
			System.out.print("LinkedList - ");
		System.out.printf("Elapsed time: %d%n", timeEllapsed);
	}
	
	
	public static void main(String [] atgs) {
		//List<Integer> list1 = new ArrayList<Integer>();
		//List<Integer> list2 = new LinkedList<Integer>();
		
		//append(list1);
		//append(list2);
		//insertZero(list1);
		//insertZero(list2);
		//traverse(list1);
		//traverse(list2);
		//removeRandom(list1);
		//removeRandom(list2);
		
		Integer [] myints = new Integer[10];
		for(int i = 0 ; i < myints.length; i++) {
			myints[i] = i;
		}
		// array to list     //static function
		List<Integer> list = Arrays.asList(myints);
		
		for(Integer element : list)
			System.out.printf("d ",  element);
		
		System.out.println();
		
		// list to array     //member function of list interface
		Integer [] myints2 = list.toArray(new Integer[list.size()]);
		for(Integer element : myints2)
			System.out.printf("d ",  element);
		
	}
}
