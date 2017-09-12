import java.util.*;

public class BubbleSort{

	public void sort(int[] arr){


		boolean sorted = false;
		for(int i = 0; i < arr.length && !sorted; i++) {

			sorted = true;
			for(int j = 0; j < arr.length  - 1 - i; j++){
				if(arr[j] > arr[j + 1]){
					swap(arr, j, j + 1);
					sorted = false;
				}
			}
		}
	}

	public static void main(String args[]){

		int[] arr = {6, 7, 1, 3, 10, 3, 4};
		new BubbleSort().sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public void swap(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}