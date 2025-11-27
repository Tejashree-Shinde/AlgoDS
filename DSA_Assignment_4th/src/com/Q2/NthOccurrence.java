package com.Q2;

public class NthOccurrence {
	 static int nthOccurrence(int arr[], int key, int n) {
	        int count = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                count++;
	                if (count == n)
	                    return i;
	            }
	        }
	        return -1;  
	    }

	    public static void main(String[] args) {
	        int arr[] = {1, 2, 3, 2, 4, 2, 5};
	        System.out.println(nthOccurrence(arr, 2, 3));  
	    }

}
