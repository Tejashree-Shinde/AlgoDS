package com.Q1;

public class PalindromeReverse {
	static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
	public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("12121"));
        System.out.println(isPalindrome("12345"));
    }

}
