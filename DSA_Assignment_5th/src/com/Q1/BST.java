package com.Q1;


class Node {
    int data;
    Node left, right;

    Node(int data) { this.data = data; }
}

public class BST {

	
	Node root;

    Node search(Node root, int key) {
        if (root == null || root.data == key)
            return root;

        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }
}
