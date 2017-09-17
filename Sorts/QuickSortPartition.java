import java.util.*;

public class QuickSortPartition{

	public static void swap(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args){

		int arr[] = {5, 6, 2 ,7, 8, 3, 6, 10};

		int i = 0;
		int w = 0;
		int pivot = arr[arr.length - 1];

		while(i < arr.length){

			if(arr[i] <= pivot){
				swap(arr, i, w);
				w++;
			}
			i++;

		}

		System.out.println(Arrays.toString(arr));
	}
}