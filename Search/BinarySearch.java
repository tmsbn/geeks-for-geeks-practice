import java.util.*;

public class BinarySearch{

	public static void main(String args[]){

		// some sorted array
		int[] arr = {2, 3, 5, 6 ,7, 10};
		int low = 0;
		int high = arr.length - 1;

		int search = 8;
		boolean found = false;

		int mid = 0;

		while(low <= high && !found){

			mid = (low + high) / 2;


			if(arr[mid] > search ){
				high = mid - 1;
			}else if(arr[mid] < search){
				low = mid + 1;
			}else{
				found = true;
			}

		}

		if(found)
			System.out.println("Found element at index " + mid);
		else
			System.out.println("Element not found");


	}
}