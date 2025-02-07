package com.LinkedList;

public class basics {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void insertAtEnd2(Node head, int data){
        Node temp = new Node(data);
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;
    }

    //display using function call
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //display using recursive call
    public static void displayRecursively(Node head){
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        displayRecursively(head.next);
        //upar ke do line ko swap karoge toh likhne ka order bhi swap ho jayega
    }
    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        //creating new node and inserting data
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        //connecting every data
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        displayRecursively(a);
        System.out.println(length(a));
        insertAtEnd2(a,57);
        display(a);
        //displaying meth 1
        //System.out.println(a.data);
        //System.out.println(b.data);
        //System.out.println(c.data);
        //System.out.println(a.next.next.data);//it is same as printing c
        //System.out.println(d.data);
        //System.out.println(e.data);
        //displaying meth 2
        //use this if we know the length of ll
       /*
       Node temp = a;
        for (int i = 1; i <= 5; i++) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        //display meth 3
        //use this if we do not have the length of ll
       // Node temp = a;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
       */
    }
}
