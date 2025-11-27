package com.Q1;

public class Mainclass {
	 public static void main(String[] args) {
	        BST t = new BST();

	        t.root = new Node(50);
	        t.root.left = new Node(30);
	        t.root.right = new Node(70);
	        t.root.left.left = new Node(20);
	        t.root.left.right = new Node(40);

	        Node result = t.search(t.root, 40);

	        if (result != null)
	            System.out.println("Found: " + result.data);
	        else
	            System.out.println("Not Found");
	    }
}
