import java.util.*;

public class SortOddNumbers{

	public void swap(int[] arr, int i,int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void sortOrderPreserved(){

		int arr[] = {3, 2, 1, 5, 9, 4, 10};

		int[] tempArr = new int[arr.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while(i < arr.length){

			
			if(arr[i] % 2 == 1){
				arr[j++] = arr[i];
			}else{
				tempArr[k++] = arr[i];
			}
			i++;
		}

		// copy elements from temp array back to main array
		i = 0;
		while(j < arr.length){
			arr[j++] = tempArr[i++]; 
		}

		System.out.println(Arrays.toString(arr));

	}

	public void sortNoOrderPreserved(){

		int arr[] = {4 ,5 ,1 ,3 , 10, 3};

		int i = 0;
		int j = arr.length - 1;

		//i = first index of even numbers
		//j = last index of odd numbers
		
		while(i < j){

			// find the first index of off even number
			while(arr[i] % 2 != 0 && i < j){
				i++;
			}

			// find the last index of odd number
			while(arr[j] % 2 == 0 && i < j){
				j--;
			}

			// swap the indices
			if(i < j && arr[i] % 2 == 0 && arr[j] % 2 != 0){
				swap(arr, i , j);
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String args[]){

		SortOddNumbers sortOddNumbers = new SortOddNumbers();
		sortOddNumbers.sortNoOrderPreserved();
		sortOddNumbers.sortOrderPreserved();

		
	}
}