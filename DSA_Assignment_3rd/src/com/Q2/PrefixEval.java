package com.Q2;

import java.util.Stack;

public class PrefixEval {

	
	static int evalPrefix(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = exp.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String t = tokens[i];

            if (t.matches("-?\\d+")) {
                st.push(Integer.parseInt(t));
            } else {
                int a = st.pop();
                int b = st.pop();
                switch(t) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalPrefix("+ 12 * 3 4")); // 12 + 3*4
    }
}
