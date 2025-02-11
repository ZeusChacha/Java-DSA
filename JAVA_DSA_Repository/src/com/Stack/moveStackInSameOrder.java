package com.Stack;

import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            /*int x = st.peek();
            rt.push(x);
            st.pop();
            ye bhi likh sakte ho
             */
            rt.push(st.pop());
        }
        System.out.println(rt);

        //again reverse matlab abhi sidha ho gya teesra container me gt me
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);

        //aur agar same container me reverse karna hai toh repeat the same process aur phla container me wapas leke jao joki st hai
        while(gt.size() > 0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
