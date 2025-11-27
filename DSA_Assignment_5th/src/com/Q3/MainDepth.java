package com.Q3;


class Node {
    int data;
    Node left, right;

    Node(int d) { this.data = d; }
}

class BST {
    Node root;

    int getLevel(int key) {
        Node temp = root;
        int level = 1;

        while (temp != null) {
            if (key == temp.data)
                return level;

            if (key < temp.data)
                temp = temp.left;
            else
                temp = temp.right;

            level++;
        }

        return -1; 
    }
}

public class MainDepth {
	public static void main(String[] args) {

        BST t = new BST();
        t.root = new Node(50);
        t.root.left = new Node(30);
        t.root.right = new Node(70);
        t.root.left.left = new Node(20);
        t.root.left.right = new Node(40);

        System.out.println("Level of 40 is: " + t.getLevel(40));
    }
}
