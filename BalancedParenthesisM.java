public class BalancedParenthesisM{

	
	public static class Stack{

		Node head = null;

		public static class Node{

			char c;
			Node next;

			public Node(char c){
				this.c = c;
			}
		}

		public void push(char c){

			Node node = new Node(c);
			if(head == null){
				head = node;
			}else{

				node.next = head;
				head = node;
			}
		}

		public char peek(){

			if(head != null)
				return head.c;
			else
				return 0;
		}

		public char pop(){

			if(head == null){
				return 0;
			}else {
				char c = head.c;
				head = head.next;
				return c;
			}
		}

		public boolean empty(){

			return head == null;
		}
	}


	public static void main(String[] args){

		String parenthesis = "{[[()}";
		BalancedParenthesisM.Stack stack = new BalancedParenthesisM.Stack();

		char[] arr = parenthesis.toCharArray();
		for(char c:arr){

			if(c == '{' || c == '(' || c == '[')
				stack.push(c);
			else if(c == '}' && stack.peek() == '{')
				stack.pop();
			else if(c == ')' && stack.peek() == '(')
				stack.pop();
			else if(c == ']' && stack.peek() == '[')
				stack.pop();
		}

		if(stack.empty())
			System.out.println("true");
		else
			System.out.println("false");


	}
}