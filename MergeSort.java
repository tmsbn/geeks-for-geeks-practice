import java.util.*;

public class MergeSort{

	public void sort(int[] arr, int low, int high){

		if(low < high){

			int mid = (low + high) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, high, mid);

		}
	}


	public void merge(int[] arr, int low, int high, int mid){

		int l1 = mid - low + 1;
		int l2 = high - mid;

		int[] lower = new int[l1]; // including mid
		int[] higher = new int[l2]; // excluding mid

		for(int i = 0; i < l1; i++){
			lower[i] = arr[low + i];
		}

		for(int i = 0; i < l2; i++){
			higher[i] = arr[mid + 1 + i];
		}

		int i = low;
		int j = 0;
		int k = 0;

		while(j < l1 && k < l2){

			if(lower[j] < higher[k]){
				arr[i] = lower[j++];
			}else{
				arr[i] = higher[k++];
			}
			i++;
		}

		while(j < l1){
			arr[i++] = lower[j++]; 
		}

		while(k < l2){
			arr[i++] = higher[k++];
		}

	}

	public static void main(String args[]){

		int arr[] = {5, 6, 1, 3, 5, 10, 2};
		new MergeSort().sort(arr, 0 , arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}
}

























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































