import java.util.*;

public class findNonRepeatingNumber{

	public static void main(String args[]){

		int[] arr = {4, 5, 4, 6, 5, 1, 6};

		int unique = 0;

		for(int number: arr){
			unique = unique ^ number;
		}

		System.out.println(unique);
	}
}