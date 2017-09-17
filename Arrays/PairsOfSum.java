import java.util.*;

public class PairsOfSum{

	public static void main(String args[]){

		int arr[] = {1, 5, 7, -1, 3, 3, 10};
		int sum = 6;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int count = 0;
		for(int num: arr){

			if(num <= sum && map.get(sum - num) != null){
				count ++;
			}else
				map.put(num, true);
		}

		System.out.println(count);

	}
}