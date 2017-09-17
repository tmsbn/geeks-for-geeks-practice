import java.util.*;

public class FindLostElement{

	public static void main(String args[]){

		int arr1[] = {6, 7, 1 , 2};
		int arr2[] = {7, 1, 2};

		int xor = 0;

		for(int val:arr1){
			xor = xor ^ val;
		}

		for(int val:arr2){
			xor = xor ^ val;
		}

		System.out.println(xor);
	}
}