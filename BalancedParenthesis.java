import java.util.*;

public class BalancedParenthesis{

	public static void main(String args[]){

		Stack<Character> stack = new Stack<Character>();

		String parenthesis = "[{}]";

		char[] arr = parenthesis.toCharArray();
		for(char c:arr){

			if(c == '[' || c == '{' || c == '('){
				stack.push(c);
			}else if(c == ')' && stack.peek() == '('){
				stack.pop();
			}else if(c == ']' && stack.peek() == '['){
				stack.pop();
			}else if(c == '}' && stack.peek() == '{'){
				stack.pop();
			}
		}

		if(stack.empty())
			System.out.println("True");
		else
			System.out.println("False");

	}
}