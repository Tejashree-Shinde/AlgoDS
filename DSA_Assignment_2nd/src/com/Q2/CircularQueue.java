package com.Q2;

public class CircularQueue {
	    int size = 5;
	    int arr[] = new int[size];
	    int front = 0, rear = 0, count = 0;

	    void enqueue(int data) {
	        if (count == size) {
	            System.out.println("Queue Full");
	            return;
	        }
	        arr[rear] = data;
	        rear = (rear + 1) % size;
	        count++;
	    }

	    void dequeue() {
	        if (count == 0) {
	            System.out.println("Queue Empty");
	            return;
	        }
	        System.out.println("Deleted: " + arr[front]);
	        front = (front + 1) % size;
	        count--;
	    }

	    void display() {
	        if (count == 0) {
	            System.out.println("Queue Empty");
	            return;
	        }
	        System.out.print("Queue: ");
	        int i = front;
	        for (int c = 0; c < count; c++) {
	            System.out.print(arr[i] + " ");
	            i = (i + 1) % size;
	        }
	        System.out.println();
	    }
}

	 

 

