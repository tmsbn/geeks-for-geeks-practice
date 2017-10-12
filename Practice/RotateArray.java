import java.util.*;

public class RotateArray{


	public void rotate(int[] arr, int times){

		int l = arr.length;
		reverse(arr, 0, l - times - 1);
		reverse(arr, l - times, l - 1);
		reverse(arr, 0, l - 1);
	}

	public void reverse(int[] arr, int i, int j){

		while(i < j){
			swap(arr, i, j);
			i++;
			j--;
		}

	}

	public void swap(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[]){

		int arr[] = {3, 4, 5, 6, 1, 8};
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotate(arr, 2);
		System.out.println(Arrays.toString(arr));

	}
}