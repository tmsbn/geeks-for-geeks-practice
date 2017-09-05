import java.util.*;

public class BubbleSort{
	

	public static void swap(int[] arr,int i,int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[]){

		int[] arr = {4, 6, 10, 2, 34, 1 , 34, 79 -1};

		boolean sorted = false;

		// if the loop is already sorted, then we can stop it early
		while(!sorted){

			sorted = true;
			for(int i = 0; i < arr.length - 1; i++){

				if(arr[i] > arr[i + 1]){
					swap(arr, i, i + 1);
					sorted = false;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}