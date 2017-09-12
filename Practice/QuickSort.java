import java.util.*;

public class QuickSort{


	public void swap(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public int partition(int[] arr, int low, int high){

		int pivot = high;
		System.out.println(pivot);
		int length = high - low;
		int i = low;
		int w = low;

		while(w < high){

			if(arr[pivot] >= arr[w]){
				swap(arr, i, w);
				i++;
			}
			w++;
			

		}
		swap(arr, i, pivot);

		return i;
	}

	public void sort(int[] arr, int low, int high){

		if(low < high){

			System.out.println(Arrays.toString(arr));
			int pivot = partition(arr, low, high);
			sort(arr, low, pivot - 1);
			sort(arr, pivot + 1, high);
			
		}

	}

	public static void main(String args[]){

		int[] arr = {2, 4, 1, 9, 0, 5};
		new QuickSort().sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));


	}
}