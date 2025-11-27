package com.Q1;

public class PalindromeRecursion {
	static boolean isPal(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return isPal(s, l + 1, r - 1);
    }
	 public static void main(String[] args) {
	        System.out.println(isPal("madam", 0, 4));
	        System.out.println(isPal("hello", 0, 4));
	        System.out.println(isPal("12121", 0, 4));
	        System.out.println(isPal("12345", 0, 4));
	    }

}
