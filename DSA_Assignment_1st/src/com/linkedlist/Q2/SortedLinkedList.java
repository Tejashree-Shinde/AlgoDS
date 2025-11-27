package com.linkedlist.Q2;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortedLinkedList {
	
		    Node head;

	    void insertSorted(int data) {
	        Node newNode = new Node(data);

	        if (head == null || data < head.data) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null && temp.next.data < data) {
	            temp = temp.next;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {

	        SortedLinkedList list = new SortedLinkedList();

	        list.insertSorted(30);
	        list.insertSorted(10);
	        list.insertSorted(50);
	        list.insertSorted(20);
	        list.insertSorted(40);
	        list.insertSorted(25);

	        System.out.println("Sorted Linked List:");
	        list.display();
	    }
	}

	   


