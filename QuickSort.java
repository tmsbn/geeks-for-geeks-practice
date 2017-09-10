import java.util.*;

public class QuickSort{

	public static void swap(int arr[], int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int arr[], int low , int high){

		int i = low - 1;
		int pivot = high;

		for(int j = low; j < high; j++){
			
			if(arr[pivot] >= arr[j]){
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, pivot);

		return pivot;

	}

	public static void quickSort(int[] arr, int low, int high){

		if(low < high){
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}
	}

	public static void main(String args[]){

		int[] arr = {5, 6, 4, 2, 7, 3};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		
	}
}