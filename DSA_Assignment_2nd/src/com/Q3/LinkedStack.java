package com.Q3;


class Node {
    int data;
    Node next;

    Node(int d) { data = d; }
}

public class LinkedStack {
	
	Node top = null;

    void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void display() {
        Node t = top;
        System.out.print("Stack: ");
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
}


