import java.util.*;

public class MaxMinForm{
	
	public static void main(String args[]){

		int arr[] = {1, 2, 3, 4, 5, 6 ,7, 8};

		int newArr[] = new int[arr.length];

		int left = 0, right = arr.length - 1, counter = 0;

		while(left <= right){

			if(counter % 2 == 0)
				newArr[counter++] = arr[left++];
			else
				newArr[counter++] = arr[right--];
		}

		System.out.println(Arrays.toString(newArr));
	}
}