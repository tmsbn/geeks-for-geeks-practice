import java.util.*;
/**
http://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/
**/
public class MergeSortedArrays{

	public static final int NA =  -1;

	public static void main(String args[]){

		int[] arr1 = {NA, NA, NA, NA, 1, 2, 3};
		int[] arr2 = {5, 8, 10, 99};

		int i = 0;
		int j = 0;
		int k = arr1.length - 1;
		int w = arr1.length - 1;

		//shift elements to the end of main array
		while(w >=0 ){

			if(arr1[w] != NA){
				arr1[k] = arr1[w];
				k--;

				if(w != k)
					arr1[w] = NA;
			}
			w--;

		}
		System.out.println(Arrays.toString(arr1));

		// To bring k to the start of numbers in array1
		k++;
		
		while(i < arr1.length){

			// if we reach end of either array, then copy the element of the other array to main array1
			if(k >= arr1.length){
				arr1[i] = arr2[j++];
			}else if(j >= arr2.length){
				arr1[i] = arr1[k++];

			// compare the elements and put in main array according to i
			}else if(arr2[j] < arr1[k]){
				arr1[i] = arr2[j++];
			}else{
				arr1[i] = arr1[k++];
			}
			i++;
		}

		System.out.println(Arrays.toString(arr1));



	}
}