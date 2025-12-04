import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
	
	public static int linearSearch(int[] data, int searchKey) {
		for(int i =0; i < data.length; i++) {
			if(searchKey == data[i])
				return i;
		}
		return -1;
	}
	
	public static int recursiveLinearSearch(int [] data, int searchKey, int start_pos) {
		if(start_pos == data.length) return -1;
		if (data[start_pos] == searchKey) return start_pos;
		else return recursiveLinearSearch(data, searchKey, start_pos+1);
	}

	public static int recursiveLinearSearch(List<Integer>data, Integer searchKey, Integer start_pos) {
		if(start_pos == data.size()) return -1;
		if (data.get(start_pos) == searchKey) return start_pos;
		else return recursiveLinearSearch(data, searchKey, start_pos+1);
	}

	public static int recursiveBinarySearch(List<Integer> data, Integer searchKey, int low, int high) {
		if(low > high) return -1;
		int middle = (low+high+1)/2;
		if(data.get(middle) == searchKey)
			return middle;
		else if(searchKey < data.get(middle))
			return recursiveBinarySearch(data, searchKey, low, middle-1);
		else
			return recursiveBinarySearch(data, searchKey, middle +1, high);
	}
	
	public static void main(String [] args) {
		int [] data = {3,6,7,8,23,-12,7,33};
		List<Integer> mydata = new ArrayList<Integer>();
		
		for(int i =0; i<20; i++) {
			mydata.add(i+1);
		}
		
		int searchKey;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a search key: ");
		
		while(input.hasNext()) {
			searchKey = input.nextInt();
			int result = recursiveBinarySearch(mydata, searchKey, 0, mydata.size()-1);
			System.out.printf("%d%n",result);
			
			System.out.print("Enter a search key: ");
		}
		input.close();
		
	}
}
