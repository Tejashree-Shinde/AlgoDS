package com.Q1;

public class LastOccurrence {

	static int lastOccurrence(int arr[], int key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                index = i;      
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 5, 7, 5, 9};
        System.out.println(lastOccurrence(arr, 5));   
}
}