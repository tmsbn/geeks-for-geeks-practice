import java.util.*;

public class SubsetArray{

	int[] arr1;
	int[] arr2;

	public SubsetArray(int[] arr1, int[] arr2){
		this.arr1 = arr1;
		this.arr2 = arr2;
	}

	public boolean checkMethod1(){

		quickSort(arr1, 0, arr1.length - 1);
		quickSort(arr2, 0, arr2.length - 1);
		

		for(int e:arr2){

			if(!binarySearch(arr1, e)){
				return false;
			}
		}

		return true;

	}

	public boolean checkMethod2(){

		HashMap<Integer, Boolean> hashmap = new HashMap<Integer, Boolean>();

		for(int i = 0; i < arr1.length; i++){
			hashmap.put(arr1[i], true);
		}


		for(int i = 0; i < arr2.length; i++){
			if(!hashmap.get(arr2[i])){
				return false;
			}
		}

		return true;
	}

	public boolean binarySearch(int[] arr, int search){

		int start = 0;
		int end = arr.length - 1;

		// Remember equals to here
		while(start <= end){

			int mid = (start + end) / 2;
			if(search < arr[mid]){
				end = mid - 1;
			}else if(search > arr[mid]){
				start = mid + 1;
			}else if(search == arr[mid])
				return true;
		}
		System.out.println(Arrays.toString(arr) + " to search:" + search);
		return false;

	}

	public void quickSort(int[] arr, int start, int end){

		if(start < end){

			int p = partition(arr, start, end);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);
		}
	}


	public int partition(int[] arr, int start, int end){

		int pivot = arr[end];
		int i = start;
		int w = start;

		while(i <= end){

			if(arr[i] <= pivot){
				swap(arr, i, w);
				w++;
			}
			i++;
		}
		return w - 1;

	}

	public void swap(int[] arr, int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args){

		int[] arr1 = {4, 5, 2, 1, 7, 3};
		int[] arr2 = {7, 1, 5};

		SubsetArray subsetArray = new SubsetArray(arr1, arr2);
		System.out.println(subsetArray.checkMethod1());
		System.out.println(subsetArray.checkMethod2());

	}
}