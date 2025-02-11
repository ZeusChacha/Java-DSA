package com.Stack;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println(postfix);
        Stack<String> val = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) val.push("" + ch);
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = op + v1 + v2;
                val.push(t);
            }
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
