import java.util.*;

public class InsertionSort{


	public void sort(int[] arr){

		int j = 0;

		for(int i = 1; i < arr.length; i++){

			int key = arr[i];

			j = i - 1;

			while(j >= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;

		}
	}

	public static void main(String args[]){

		int arr[] = {5, 6, 1, 4, 3, 10, 3, 0};
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}