import java.util.*;

public class BinaryTree{

	public Node root;

	public class Node{

		Node(int value){
			this.value = value;
		}

		int value;
		Node left;
		Node right;
	}

	public void insert(int value){
		root = insertNode(root, value);
	}


	public Node insertNode(Node node, int value){

		if(node == null){
			return new Node(value);
		}else{
			if(value < node.value){
				node.left = insertNode(node.left, value);
			}else{
				node.right = insertNode(node.right, value);
			}
			return node;
		}
	}

	public boolean contains(int value){

		return containsNode(value, root);

	}

	private boolean containsNode(int searchValue, Node node){

		if(node == null){
			return false;
		}
		else if(searchValue == node.value)
			return true;
		else if(searchValue > node.value ){
			return containsNode(searchValue, node.right);
		}else{
			return containsNode(searchValue, node.left);
		}
	}

	public void print(){

		Node temp = root;
		Queue<Node> nodes = new LinkedList<Node>();
		nodes.add(temp);
		nodes.add(null);
		
		while(!nodes.isEmpty()){
			Node currentNode = nodes.remove();
			if(currentNode == null){
				if(nodes.size() > 0){
					System.out.println();
					nodes.add(null);
				}
				else
					break;
			}else {

				if(currentNode.value != -1)
					System.out.print(currentNode.value + " ");
				else
					System.out.print(" ");

				if(currentNode.left != null || currentNode.right != null){
					if(currentNode.left != null)
						nodes.add(currentNode.left);
					else
						nodes.add(new Node(-1));

					if(currentNode.right!= null)
						nodes.add(currentNode.right);
					else
						nodes.add(new Node(-1));
				}

			}

		}
		System.out.println();

	}

	private int countSize(Node node){

		if(node != null){
			return 1 + countSize(node.left) + countSize(node.right);
		}else
			return 0;
	}

	private int getMaxDepthRe(Node node){

		if(node == null)
			return 0;
		else
			return Math.max(1 + getMaxDepthRe(node.left), 1 + getMaxDepthRe(node.right));
	}

	public int getMaxDepth(){

		Node temp = root;
		Queue<Node> nodes = new LinkedList<Node>();
		nodes.add(root);

		int depth = 0;
		int count =  0;

		while(!nodes.isEmpty()){

			if(count == 0)
				count = nodes.size();

			Node currentNode = nodes.remove();
			count--;

			if(currentNode.left != null){
				nodes.add(currentNode.left);
			}

			if(currentNode.right != null){
				nodes.add(currentNode.right)
			}
		}

		return count;
	}

	public int size(){

		return countSize(root);

	}

	public void insertMany(int[] arr){

		for(int i = 0; i < arr.length; i++){
			insert(arr[i]);
		}
	}

	private boolean hasPathSumRe(Node node, int targetSum){

		if(node == null)
			return false;
		else{
			if(targetSum - node.value == 0){
				return true;
			}else{
				return hasPathSumRe(node.left, targetSum - node.value) || hasPathSumRe(node.right, targetSum - node.value);
			}
		}
	}

	public void mirror(){

		mirrorRe(root);
	}

	public void mirrorRe(Node node){

		if(node == null)
			return;
		else{
			mirrorRe(node.left);
			mirrorRe(node.right);

			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
		}

	}

	public boolean sameTree(BinaryTree binaryTree){
		return sameTreeRe(root, binaryTree.root);
	}

	private boolean sameTreeRe(Node node1, Node node2){

		if(node1 == null && node2 == null){
			return true;
		}else if(node1 != null && node2 != null){

			return node1.value == node2.value && sameTreeRe(node1.left, node2.left)
				&& sameTreeRe(node1.right, node2.right);
		}else{
			return false;
		}
	}

	public void doubleTree(){
		 doubleTreeRe(root);
	}

	public void doubleTreeRe(Node node){

		if(node == null){
			return;
		}else{

			doubleTreeRe(node.left);
			doubleTreeRe(node.right);

			Node temp = node.left;
			node.left = new Node(node.value);
			node.left.left = temp;
		}
	}

	public boolean hasPathSum(int targetSum){

		return hasPathSumRe(root, targetSum);
	}

	public int minValue(){

		Node temp = root;

		if(temp == null)
			return -1;

		while(temp.left != null){
			temp = temp.left;
		}
		return temp.value;
	}

	
	public static void main(String[] args){

		BinaryTree binaryTree = new BinaryTree();
		BinaryTree binaryTree2 = new BinaryTree();

		binaryTree.insertMany(new int[]{0, 6, 5, 7, 3});
		binaryTree2.insertMany(new int[]{0, 6, 5, 7});

		binaryTree.print();
		System.out.println("Size is " + binaryTree.size());
		System.out.println("The depth is:" + binaryTree.getMaxDepthRe(binaryTree.root));
		System.out.println("Minimum value is:" + binaryTree.minValue());

		int sum = 8;
		System.out.println("A path sum of " + sum + ":" + binaryTree.hasPathSum(sum));

		
		System.out.println(binaryTree.sameTree(binaryTree2));

	}
}