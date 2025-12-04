import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingAlgorithms {

	public static void selectionSort(List<Integer> data) {
		
		for(int i = 0; i<data.size()-1; i++) {
			int smallest = i;
			
			for(int index = i+1; index < data.size(); index++) {
				if(data.get(index) < data.get(smallest))
					smallest = index;
			}
			
			Integer temporary = data.get(i);
			data.set(i,  data.get(smallest));
			data.set(smallest,  temporary);
			
		}
	}
	
	public static void insertionSort(List<Integer> data) {
		for(int next = 1; next < data.size(); next++) {
			Integer insert = data.get(next);
			int moveItem = next;
			
			while( moveItem >0 && data.get(moveItem-1)> insert) {
				data.set(moveItem, data.get(moveItem -1));
				moveItem--;
			}
			
			data.set(moveItem, insert);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<4 ; i++) {
			System.out.print("Enter an Integer: ");
			myList.add(input.nextInt());
		}
		
		//selectionSort(myList);
		insertionSort(myList);
		for(Integer element : myList)
			System.out.printf("%d ",element);
		
		input.close();
	}

}
