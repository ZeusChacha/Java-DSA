package com.Stack2;

public class StackMain {
    public static void main(String[] args) throws Exception{
        //MATLAB DYNAMIC ME KITNA BHI ELEMENTS DAL SAKTE HAI SPACE AUTOMATICALLY INCREASE HOTA HAI UNLIKE CUSTOM
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop()); //ye wala error dega CUSTOM ME
    }
}
