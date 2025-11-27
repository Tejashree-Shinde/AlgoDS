package com.Q2;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}

class BST {

    void inorder(Node root, ArrayList<Node> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }

    Node successor(Node root, int key) {
        ArrayList<Node> list = new ArrayList<>();
        inorder(root, list); 

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).data == key) {
                if (i + 1 < list.size())
                    return list.get(i + 1);  
                else
                    return null;  
            }
        }
        return null; 
    }
    

}

public class SuccessorOfNode {
	public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        BST t = new BST();
        Node succ = t.successor(root, 40);

        if (succ != null)
            System.out.println("Successor of 40 is: " + succ.data);
        else
            System.out.println("No Successor Found");
    }
}



