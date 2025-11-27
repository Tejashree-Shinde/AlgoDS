package com.linkedlist.Q1;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
	

	    Node head;

	    void insertAfter(int key, int newData) {
	        Node temp = head;

	        while (temp != null && temp.data != key) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Node not found");
	            return;
	        }

	        Node newNode = new Node(newData);
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }



	    void insertBefore(int key, int newData) {
	        Node newNode = new Node(newData);

	        if (head == null) return;

	        if (head.data == key) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null && temp.next.data != key) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Node not found");
	            return;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	}



