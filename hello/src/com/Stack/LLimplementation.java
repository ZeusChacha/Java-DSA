package com.Stack;

public class LLimplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if (head == null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;

        }
        int peek(){
            if (head == null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayRec(Node h){
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if (size==0 ) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("peak element: "+st.peek());
        st.display();
        System.out.println("size is: " + st.size());
        System.out.println("popped element: "+st.pop());
        st.display();
        //System.out.println(st.isFull());
    }
}
