package com.LinkedList;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        public void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        //use this insert method in an existing linked list jaha elements phle se exist karte hai
        /*public void insertAtEnd2(Node head, int data){
            Node temp = new Node(data);
            Node t = head;
            while(t.next != null){
                t = t.next;
            }
            t.next = temp;
        }

         */
        public void insertAtBeginning(int data){
            Node temp = new Node(data);
            if (head == null) {
                tail = temp;
            }
            else {
                temp.next = head;
            }
            head = temp;
        }
        public void insertAt(int idx, int data){
            Node t  = new Node(data);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(data);
                return;
            }
            else if (idx == 0){
                insertAtBeginning(data);
                return;
            }
            else if (idx < 0 || idx > size()) {
                System.out.println("Wrong Index");
                return;
            }
            for (int i = 1; i < idx-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        public int getAt(int idx){
            Node temp = head;
            if (idx == size()) {
                System.out.println("index out of bound");
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            System.out.println();
            return temp.data;
        }
        public void deleteAtIndex(int idx){
            if (idx == 0) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            System.out.println();
            temp.next = temp.next.next;
            tail = temp;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtBeginning(1);
        ll.insertAtBeginning(2);
        ll.insertAt(2,3);
        ll.insertAt(5,6);
        ll.display();
        ll.deleteAtIndex(3);
        ll.display();
        System.out.println(ll.getAt(4));
        System.out.println(ll.size());
        //jaha add ya insert ho rha h element waha last me size++ laga dena aur size
        // ko upar 0 declare kar dena toh size wala method likhna nhi padega niche direct sout ll.size likh dena
    }
}
