import java.util.*;

public class InsertionSort{
	
	public void sort(int[] arr){

		int j = 0, key = 0;

		for(int i = 0 ; i < arr.length; i++){
			
			j = i - 1;
			key = arr[i];

			while(j>= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}

	}

	public static void main(String args[]){

		int arr[] = {1, 1, 1, 1, 1, 1, 1};

		new InsertionSort().sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}