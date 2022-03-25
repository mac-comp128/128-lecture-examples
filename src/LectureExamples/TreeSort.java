package LectureExamples;

import java.util.*;

/* 
    Tree sort example modified from https://www.netjstech.com/2019/02/tree-sort-in-java-using-binary-search-tree.html 
    Demonstrating using a binary search tree to sort numbers
*/


public class TreeSort {
    
    /* A basic node structure to store a number */
    public class Node {
        public int key;
        public Node left, right;
 
        public Node(int item){
            key = item;
            left = right = null;
        }
    }
 
    /* Root node for the binary search tree */
    public Node root;
 
    /* Default constructor */
    public TreeSort(){
        root = null;
    }
 
    /* The wrapper method for insert a node to BST */
    public void insert(int key){
        root = insertRecursive(root, key);
    }
     
    /* The recursive function actually does the insert work */
    public Node insertRecursive(Node root, int key){
        /* If the tree is empty, return a new node */
        if (root == null){
            root = new Node(key);
            return root;
        }
        /* Otherwise, call the method on its left subtree and right subtree */
        if (key < root.key){
            root.left = insertRecursive(root.left, key);
        }
        else if (key > root.key){
            root.right = insertRecursive(root.right, key);
        }
        /* return the root */
        return root;
    }
     
    /* Implement inorder traversal, to return values in sorted order */
    public void inorderTraverse(Node root){
        if (root != null){
            inorderTraverse(root.left);
            System.out.print(root.key + " ");
            inorderTraverse(root.right);
        }
        else {
            return;
        }
    }
    
    /* A helper function to create a BST from an array */
    public void arrayToTree(int arr[]){
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }    
    }
 
    /* Example to test tree sort */
    public static void main(String[] args) {
        TreeSort bst = new TreeSort();
        int arr[] = {50, 30, 70, 15, 7, 62, 22, 35, 87, 22, 31};
        bst.arrayToTree(arr);
        bst.inorderTraverse(bst.root);
    }
}


