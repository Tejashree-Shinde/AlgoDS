package com.Q1;

import java.util.Stack;

public class PalindromeStack {
	 static boolean isPalindrome(String s) {
	        Stack<Character> st = new Stack<>();
	        for (char c : s.toCharArray())
	            st.push(c);

	        String rev = "";
	        while (!st.isEmpty())
	            rev += st.pop();

	        return s.equals(rev);
	    }
	 public static void main(String[] args) {
	        System.out.println(isPalindrome("madam"));
	        System.out.println(isPalindrome("hello"));
	        System.out.println(isPalindrome("12121"));
	        System.out.println(isPalindrome("12345"));
	    }

}
