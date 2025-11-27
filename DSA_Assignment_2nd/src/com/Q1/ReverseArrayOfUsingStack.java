package com.Q1;

import java.util.Stack;

public class ReverseArrayOfUsingStack {
	

	    public static void main(String[] args) {

	        int arr[] = {10, 20, 30, 40, 50};
	        Stack<Integer> stack = new Stack<>();

	        for (int x : arr) {
	            stack.push(x);
	        }

	        int i = 0;
	        while (!stack.isEmpty()) {
	            arr[i++] = stack.pop();
	        }

	        System.out.print("Reversed Array: ");
	        for (int x : arr) {
	            System.out.print(x + " ");
	        }
	    }
	}



