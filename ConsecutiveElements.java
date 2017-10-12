import java.util.*;

public class ConsecutiveElements{


	int[] arr;
	public ConsecutiveElements(int[] arr){
		this.arr = arr;
	}

	public boolean checkMethod1(){

		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++){
			if(arr[i] - 1 != arr[i - 1])
				return false;
		}
		return true;
	}

	public boolean checkMethod2(){

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i ++){

			if(arr[i] < minValue){
				minValue = arr[i];
			}

			if(arr[i] > maxValue){
				maxValue = arr[i];
			}
		}

		int[] count = new int[maxValue - minValue + 1];

		for(int i = 0; i < arr.length; i++){
			count[arr[i] - minValue]++;
		}

		for(int i = 0; i < count.length; i++){
			if(count[i] != 1)
				return false;
		}
		return true;
	}




	public static void main(String[] args){

		int arr[] = {8, 6, 7, 9, 5};
		ConsecutiveElements cons = new ConsecutiveElements(arr);
		System.out.println(cons.checkMethod1());
		System.out.println(cons.checkMethod2());


	}
}