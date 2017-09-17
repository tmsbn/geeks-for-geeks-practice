public class LinkedList{


	private Node head = null;
	private Node tail = null;

	private class Node{

		int value;
		Node next = null;

		public Node(int value){
			this.value = value;
		}
	}

	public LinkedList splitList(){

		LinkedList newList = new LinkedList();

		Node temp1 = head;
		Node temp2 = head;

		if(head == null || head.next == null){
			return newList;
		}else{

			while(temp2.next != null && temp2.next.next != null){

				temp1 = temp1.next;
				temp2 = temp2.next.next;
			}

			tail = temp1;
			newList.head = temp1.next;
			newList.tail = temp2;
			tail.next = null;
			return newList;

		}
	}

	public void append(LinkedList l2){

		tail.next = l2.head;
		l2.head = null;
		tail = l2.tail;
		l2.tail = null;

	}

	public void print(){

		Node temp = head;
		while(temp != null){
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void pushMany(int[] arr){

		for(int val:arr){
			sortedInsert(val);
		}
	}

	public void insertMany(int arr[]){

		for(int val:arr){
			insert(val);
		}
	}

	public void insert(int val){

		Node node = new Node(val);
		if(head == null){
			head = node;
			tail = node;
		}else if(head != null){

			tail.next = node;
			tail = node;
		}
	}

	public void sortedInsert(int value){

		Node node = new Node(value);
		// if head is null , then insert head
		if(head == null){
			head = node;
			tail = node;
		
		}else if(head.value > node.value){
			node.next = head;
			head = node;
		}else{

			Node prev = head;
			Node temp = head.next;

			while(temp != null && temp.value < value){

				prev = temp;
				temp = temp.next;
			}

			prev.next = node;
			node.next = temp;

			if(temp == null){
				tail = node;
			}
		}
	}

	public void push(int val){

		Node node = new Node(val);

		if(head == null){
			head = node;
		}else{
			node.next = head;
			head = node;
		}
	}


	public int getNthElement(int val){

		Node temp = head;

		int idx = 0;

		while(temp != null && idx != val){

			temp = temp.next;
			idx++;
		}

		if(temp != null){
			return temp.value;
		}else{
			return -1;
		}
	}

	public int count(int val){

		Node temp = head;

		int count = 0;

		while(temp != null){

			if(temp.value == val){
				count ++;
			}
			temp = temp.next;
		}

		return count;
	}

	public void swap(Node n1, Node n2){

		int temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	public void removeDuplicates(){

		Node temp1 = head;
		Node temp2 = head;

		while(temp1.next != null){

			temp1 = temp1.next;
			if(temp1.value != temp2.value){
				temp2 = temp2.next;
				swap(temp1, temp2);
			}

		}

		temp2.next = null;
		temp2 = tail;
	}

	public Node pop(){

		Node temp = head;
		head = head.next;
		return temp;
	}

	public int seek(){

		return head != null ? head.value : -1;
	}

	public void deleteList(){
		head = null;
	}

	public static void main(String[] args){

		LinkedList linkedList1 = new LinkedList();
		LinkedList linkedList2 = new LinkedList();
		linkedList1.insertMany(new int[]{8, 8, 8, 3, 3, 3});
		// linkedList2.insertMany(new int[]{6, 2, 1, 3, 5, 6});
		// linkedList1.append(linkedList2);
		// linkedList1.print();
		linkedList1.removeDuplicates();
		linkedList1.print();
		//splitList.print();

	}
}