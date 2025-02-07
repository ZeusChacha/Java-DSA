package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }
            else {
                if (st.size() == 0) return false;

                else if (st.peek() == '(') st.pop();
            }
        }
        if (st.size() > 0) return false;

        else return true;
    }
    public static  String isBalanced2(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(')');
            }
            else if(str.charAt(i) == '{'){
                stack.push('}');
            }
            else if(str.charAt(i) == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || str.charAt(i) != stack.pop()){
                return "NO";
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
    public static int minAddToMakeBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()){
            if (ch ==  ')'){
                if (!stack.isEmpty() || stack.peek() != '('){
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }
            else {
                stack.push(ch);
            }
        }
        return stack.size();
    }


    public static boolean paranthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the brackets and check!");
            String str = sc.nextLine();
            //System.out.println(paranthesis(str));
            System.out.println(isBalanced2(str));
        }
    }
