package com.binaryTree;

/* Class containing left and right child of current
node and key value*/
public class Node {
	int key;
	Node left;
	Node right;
	
	//Constructor
	public Node(int data) {
		this.key = data;
		this.left = null;
		this.right = null;
	}
}