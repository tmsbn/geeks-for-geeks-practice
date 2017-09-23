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

				System.out.print(currentNode.value + " ");

				if(currentNode.left != null)
					nodes.add(currentNode.left);

				if(currentNode.right!= null)
					nodes.add(currentNode.right);
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
		nodes.add(null);
		int count = 0;
		while(!nodes.isEmpty()){

			Node currentNode = nodes.remove();
			if(currentNode == null){
				count++;
				if(nodes.size() > 0){
					nodes.add(null);
				}else{
					break;
				}
			}else{
				if(currentNode.left != null)
					nodes.add(currentNode.left);
				else if(currentNode.right != null)
					nodes.add(currentNode.right);
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

	private boolean hasPathSumRe(Node node, int sum, int targetSum){

		if(node == null)
			return false;
		else{
			if(node.value + sum == targetSum){
				return true;
			}else{
				sum = sum + node.value;
				return hasPathSumRe(node.left, sum, targetSum) || hasPathSumRe(node.right, sum, targetSum);
			}
		}
	}

	public boolean hasPathSum(int targetSum){

		return hasPathSumRe(root, 0, targetSum);
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
		binaryTree.insertMany(new int[]{0, 6, 5, 7, 3});
		binaryTree.print();
		System.out.println("Size is " + binaryTree.size());
		System.out.println("The depth is:" + binaryTree.getMaxDepthRe(binaryTree.root));
		System.out.println("Minimum value is:" + binaryTree.minValue());

		int sum = 8;
		System.out.println("A path sum of " + sum + ":" + binaryTree.hasPathSum(11));


	}
}