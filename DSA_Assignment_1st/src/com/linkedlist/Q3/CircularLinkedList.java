package com.linkedlist.Q3;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
	
	    Node tail = null;

	    void insert(int data) {
	        Node newNode = new Node(data);

	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail;  
	            return;
	        }

	        newNode.next = tail.next; 
	        tail.next = newNode;      
	        tail = newNode;           
	    }

	    void display() {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node temp = tail.next; 

	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != tail.next); 

	        System.out.println();
	    }
	

	    public static void main(String[] args) {
	        CircularLinkedList cl = new CircularLinkedList();

	        cl.insert(10);
	        cl.insert(20);
	        cl.insert(30);
	        cl.insert(60);

	        System.out.println("Circular Linked List:");
	        cl.display();
	    }
	}



