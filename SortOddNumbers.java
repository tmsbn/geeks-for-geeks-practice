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

		//i = first index of even numbers
		//j = first index of odd numbers after i 
		int j = i + 1;

		int k = 0;


		while(i < arr.length){

			// Find the first index of an even number
			while(arr[i] % 2 == 1){
				i++;
			}

			if(i < arr.length){
				
				j = i + 1;

				// copy even number to temp array
				tempArr[k] = arr[i];
				k++;
				
				// find the first index of odd number after i
				while(j < arr.length && arr[j] % 2 == 0){
					j++;
				}

				// copy the odd number to the even number index
				if(j < arr.length)
					arr[i] = arr[j];

				i++;
			}

		}

		// copy elements from temp array back to main array
		i = 0;
		while(i < k){
			arr[arr.length - 1 - i] = tempArr[k - 1 - i];
			i++; 
		}

		System.out.println(Arrays.toString(arr));

	}

	public void sortNoOrderPreserved(){

		int arr[] = {4 ,5 ,1 ,3 , 10, 3};

		int i = 0;
		int j = arr.length - 1;

		//i = first index of even numbers
		//j = last idnex of odd numbers
		
		while(i < j){

			// find the first index of off even number
			while(arr[i] % 2 != 0){
				i++;
			}

			// find the last index of odd number
			while(arr[j] % 2 == 0){
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