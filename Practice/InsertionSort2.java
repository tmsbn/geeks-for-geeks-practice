import java.util.*;

public class InsertionSort2{

	public static void main(String args[]){

		int arr[] = {6};
		int j = 0;

		for(int i = 1; i < arr.length; i++){
			j = i - 1;
			int temp = arr[i];
			while(j>= 0 && temp < arr[j]){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

		System.out.println(Arrays.toString(arr));


	}
}