import java.util.*;

public class NextGreaterElement{

	public static void main(String args[]){

		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = {4, 7, 2, 1, 3, 9, 10};

		stack.push(arr[0]);

		for(int i = 1; i < arr.length; i++){


			while(!stack.empty() && stack.peek() < arr[i]){
				System.out.println(stack.pop() + " " + arr[i]);
	
			}

			stack.push(arr[i]);
		}

		while(!stack.empty()){
			System.out.println(stack.pop() + " " + -1 );
		}

	}
}