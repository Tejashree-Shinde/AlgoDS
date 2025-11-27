package com.Q2;

public class Mainclass {

	public static void main(String[] args) {

		 CircularQueue q = new CircularQueue();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.display();
	        q.dequeue();
	        q.display();
	        q.enqueue(40);
	        q.enqueue(50);
	        q.enqueue(60);
	        q.display();
	}

}
