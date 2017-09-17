import java.util.*;

public class PairOfSumNoSpace{

	public static void main(String args[]){

		int[] arr = {4, 5, 1, 6, 10 , 2, 3};

		Arrays.sort(arr);

		int left = 0;
		int right = arr.length - 1;
		int sum = 0;

		int target = 7;

		while(left < right){

			sum = arr[left] + arr[right];
			if(sum > target){
				right--;
			}else if(sum < target){
				left++;
			}else{
				System.out.println(arr[left] + "," + arr[right]);
				right--;
				left++;
			}
		}


	}
}