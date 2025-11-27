package com.Q3;

public class LinkedQueue {
	Node front = null, rear = null;

    void enqueue(int data) {
        Node n = new Node(data);
        if (rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Deleted: " + front.data);
        front = front.next;
        if (front == null) rear = null;
    }

    void display() {
        Node t = front;
        System.out.print("Queue: ");
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

}
