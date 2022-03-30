package LectureExamples;


/* Example code modified from https://www.journaldev.com/23022/height-of-a-tree-data-structure#:~:text=To%20calculate%20the%20height%20of%20the%20tree%20recursively%2C%20we%20need,topmost%20node%20and%20its%20children). and https://www.cs.cornell.edu/courses/JavaAndDS/recursion/recursionTree.html to demonstrate recursion patterns on trees */

public class BinarySearchTree {

	/* Basic class for a tree node*/
	public class TreeNode {
		int key;
		TreeNode left, right;

		public TreeNode(int item){
			key = item;
			left = right = null;
		}
	}

	/* The root of the tree */
	public TreeNode root;

	/* Default constructor */
	public BinarySearchTree() { 
		root = null; 
	}

	/*
	
	First recursion pattern on trees: accumulate information about a tree

	Often follows the pattern: 
		1) return the base case when the node is null or if it is a leaf node
		2) otherwise call the method on its child nodes and return result plus 1 
	
	Upating the height of x and pivot is also an example of this pattern in AVL tree activity
		
	*/
	public int height(TreeNode root) {
		/* Base case, if the node is null, return -1 (given root start at level 0) */
		if (root == null){
			return -1;
		}
		/* Otherwise, we run the method on its child nodes - get subtree height on its left child and right child */
		int leftTreeHeight = height(root.left);
		int rightTreeHeight = height(root.right);

		/* Take the larger height and increment by 1 */
		return Math.max(leftTreeHeight, rightTreeHeight) + 1;
	}


	/* Wrapper method for recursive delete */
	/* Decompse the delete to a recursive method */
	public void delete(int key) { 
		root = deleteRecursive(root, key); 
	}

	/* 
	
	Second recursion pattern on trees: search a tree node with certain property

	Often follows the pattern:
		1) Handle the base case when the tree/local root is emoty (often returns null)
		2) Handel the base case if local root has the property we are searching for
		3) Otherwise, call the method on its left subtree and right subtree

	FindCloset is also an example of this pattern from BinarySearchTree activity
	
	*/
	private TreeNode deleteRecursive(TreeNode root, int key){
		/* Base case, return root if it is null */
		if (root == null){
			return root;
		}

		/* Otherwise, call the method on its left and right subtrees */
		if (key < root.key){
			root.left = deleteRecursive(root.left, key);
		}
		else if (key > root.key){
			root.right = deleteRecursive(root.right, key);
		}
		
		/* If the local root is the one we are searching for */
		else {
			/* When one is null, we can simply return the other */
			if (root.left == null){
				return root.right;
			}
			else if (root.right == null){
				return root.left;
			}

			/* Otherwise, we need to replace the local root with the smallest one from its right subtree*/
			root.key = findSmallestChild(root.right);

			/* Then delete the target node*/
			root.right = deleteRecursive(root.right, root.key);
		}

		return root;
	}

	/* Helper method for finding the smallest node */	
	public int findSmallestChild(TreeNode root){
		int min = root.key;
		while (root.left != null){
			min = root.left.key;
			root = root.left;
		}
		return min;
	}

	/* Wrapper for insert recusive method */
	public void insert(int key) { 
		root = insertRecursive(root, key); 
	}

	/* Recursive method for insert a node to the tree*/
	private TreeNode insertRecursive(TreeNode root, int key){

		/* If empty, just create a new node */
		if (root == null) {
			root = new TreeNode(key);
			return root;
		}

		/* Otherwise, recursive down the tree */
		if (key < root.key){
			root.left = insertRecursive(root.left, key);
		}
		else if (key > root.key){
			root.right = insertRecursive(root.right, key);
		}

		return root;
	}

	/* Inorder traversal on the tree */
	public void inorder() { inorderRecursive(root); }

	private void inorderRecursive(TreeNode root){
		if (root != null) {
			inorderRecursive(root.left);
			System.out.print(root.key + " ");
			inorderRecursive(root.right);
		}
	}

	
	/* Demonstrate example */
	public static void main(String[] args){

		BinarySearchTree tree = new BinarySearchTree();

		/* 
		
		Create the following binary search tree 

			50
		  /	   \
	     30	   70
		 / \    / \ 
		20 40  60 80
	    /
	   10
		
		*/
		tree.insert(50);
		tree.insert(30);

		System.out.println("Current height:");
		System.out.println(tree.height(tree.root));

		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(10);

		System.out.println("Current height:");
		System.out.println(tree.height(tree.root));

		System.out.println("\nInorder traversal of the given tree");
		tree.inorder();
	

		System.out.println("\nDelete 20");
		tree.delete(20);
		System.out.println("\nInorder traversal of the modified tree");
		tree.inorder();

		
	}
}

    

