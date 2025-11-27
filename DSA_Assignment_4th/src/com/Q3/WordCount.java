package com.Q3;

import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
        String line = "apple mango apple orange mango apple";

        String words[] = line.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);

        System.out.println(map);
    }

}
