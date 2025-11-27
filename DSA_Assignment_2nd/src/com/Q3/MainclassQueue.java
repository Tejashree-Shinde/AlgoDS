package com.Q3;

public class MainclassQueue {
	 public static void main(String[] args) {

	        LinkedQueue q = new LinkedQueue();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.display();
	        q.dequeue();
	        q.display();
	    }

}
