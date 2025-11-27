package com.Q2;

import java.util.Stack;

public class PostfixEval {

	
	static int evalPostfix(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = exp.split(" "); 

        for (String t : tokens) {
            if (t.matches("-?\\d+")) {   
            } else {                    
                int b = st.pop();
                int a = st.pop();
                switch(t) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                    case "%": st.push(a % b); break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalPostfix("12 3 4 * +")); 
    }

}
