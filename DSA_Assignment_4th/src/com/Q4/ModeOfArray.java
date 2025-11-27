package com.Q4;

import java.util.HashMap;

public class ModeOfArray {

	static int mode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        int mode = arr[0], max = 0;

        for (int key : freq.keySet()) {
            if (freq.get(key) > max) {
                max = freq.get(key);
                mode = key;
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4};
        System.out.println(mode(arr));
    }
}
