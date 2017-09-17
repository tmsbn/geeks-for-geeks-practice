import java.util.*;

public class FindFirstOccuranceOfElement{

	public static void main(String[] args){

		int search = 5;
		int[] arr = {4, 5, 5 ,2, 9, 3, 3, 3, 7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		FindFirstOccuranceOfElement findFirstOccuranceOfElement = new FindFirstOccuranceOfElement();
		int index = findFirstOccuranceOfElement.binarySearchFirstEl(arr, 0, arr.length - 1, search);
		System.out.println(index);


	}


	public int binarySearchFirstEl(int[] arr, int low, int high, int search){

		while(low <= high){

			int mid = (low + high) / 2;
			if(arr[mid] == search){


				if(mid != 0 && (arr[mid - 1] == arr[mid])){
					high = mid - 1;
				}else{
					return mid;
				}
			}else if(arr[mid] < search){
				low = mid + 1;
			}else if(arr[mid] > search){
				high = mid - 1;
			}
		}

		return -1;
	}

	public int binarySearchLastEl(int[] arr, int low, int high, int search){

		while(low <= high){

			int mid = (low + high) / 2;
			if(arr[mid] == search){


				if(mid != arr.length - 1 && (arr[mid + 1] == arr[mid])){
					high = mid - 1;
				}else{
					return mid;
				}
			}else if(arr[mid] < search){
				low = mid + 1;
			}else if(arr[mid] > search){
				high = mid - 1;
			}
		}

		return -1;
	}
}