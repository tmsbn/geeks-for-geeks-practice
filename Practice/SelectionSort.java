import java.util.*;

public class SelectionSort{

	public void swap(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void sort(int[] arr){

		int min_idx = -1;
		for(int i = 0; i < arr.length - 1; i++){
			min_idx = i;
			for(int j = i + 1; j < arr.length; j++){

				if(arr[min_idx] > arr[j]){
					min_idx = j;
				}
			}

			swap(arr, min_idx, i);
		}
	}

	public static void main(String[] args){

		int[] arr = {1, 2};
		new SelectionSort().sort(arr);

		System.out.println(Arrays.toString(arr));


	}
}