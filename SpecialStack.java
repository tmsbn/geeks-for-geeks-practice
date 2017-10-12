import java.util.*;

public class SpecialStack{
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();

	int count = 0;
	int MAX =  10;

	public void push(int x){

		stack.push(x);
		if(minStack.empty() || (minStack.peek() >= x)){
			minStack.push(x);
		}
		count++;

	}

	public int pop(){

		
		if(minStack.peek() == stack.peek())
			minStack.pop();

		count--;
		return stack.pop();
		

	}

	public int getMin(){

		return minStack.peek();
	}


	public boolean isEmpty(){

		return count == 0;
	}

	public boolean isFull(){

		return count == MAX;
	}

	public void pushMany(int[] arr){

		for(int e:arr){
			push(e);
		}
	}



	public static void main(String args[]){

		SpecialStack specialStack = new SpecialStack();
		specialStack.pushMany(new int[]{6, 5, 10, 3, 4, 6, 34 , 10});
		System.out.println(specialStack.getMin());
		specialStack.pop();
		specialStack.pop();
		specialStack.push(1);
		System.out.println(specialStack.getMin());

	}
}