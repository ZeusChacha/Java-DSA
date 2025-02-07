package com.Stack;

import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        st.pop();
        //pop() delete the top element in the stack

        System.out.println(st);

        System.out.println(st.peek());
        //peek() shows the top element of the stack

        System.out.println("size is: " + st.size());//size() checks the size of the stack

        System.out.println(st.isEmpty());//returns boolean value basically it checks the stack is empty or not
    }
}
