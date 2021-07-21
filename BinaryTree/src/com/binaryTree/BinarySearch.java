package com.binaryTree;

import java.util.Scanner;

//A Java program to introduce Binary Tree
public class BinarySearch {

	Node root; // Root of Binary Tree
	static boolean flag = false;

	// Constructors
	public BinarySearch() {
		root = null;
	}

	/*
	 * Method to insert data Data :: Key to be inserted
	 */
	public void insert(int key) {
		Node newNode = new Node(key);

		if (root == null) {
			root = newNode;
			return;
		}

		else {
			Node current = root;
			Node parent = null;
			while (true) {
				parent = current;
				if (key < current.key) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	/*
	 * Method to display inserted data
	 */
	public void inorderTraversal(Node node) {
		if (root == null)
			System.out.println("Tree is empty");
		else {
			if (node.left != null)
				inorderTraversal(node.left);
			System.out.print(node.key + " ");
			if (node.right != null)
				inorderTraversal(node.right);
		}
	}

	/*
	 * Method to search inserted data
	 */
	public void searchNode(Node node, int value) {
		if (root == null)
			System.out.println("Tree is empty");
		else {
			if (node.key == value) {
				flag = true;
				return;
			}
			if (flag == false && node.left != null) {
				searchNode(node.left, value);
			}
			if (flag == false && node.right != null) {
				searchNode(node.right, value);
			}
		}
	}

	public static void main(String[] args) {
		BinarySearch binary = new BinarySearch();

		binary.insert(56);
		binary.insert(30);
		binary.insert(70);
		binary.insert(22);
		binary.insert(40);
		binary.insert(11);
		binary.insert(3);
		binary.insert(16);
		binary.insert(60);
		binary.insert(95);
		binary.insert(65);
		binary.insert(63);
		binary.insert(67);

		System.out.println("Inorder Traversal of Binary Search tree");
		binary.inorderTraversal(binary.root);

		System.out.println("\n");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		int x = sc.nextInt();
		binary.searchNode(binary.root, x);

		if (flag)
			System.out.println("Element " + x + " is present");
		else
			System.out.println("Element " + x + " is not present");
	}

}
