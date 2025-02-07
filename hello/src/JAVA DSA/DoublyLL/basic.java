package com.DoublyLL;

public class basic {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp = random;
        //move this temp backward to head
        while(temp.prev != null){
            temp = temp.prev;
        }
        //now temp is at head, print the list
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int x){
        Node temp = new Node(35);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }
    public static void deleteAtIndex2(Node head, int idx){
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
        //head = temp;
    }
    public static void insertAtEnd(Node head , int x){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAtIdx(Node head, int idx, int x){
        Node s = head;
        for (int i = 1; i < idx-1; i++) {
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }
    public static Node deleteDuplicates(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            if (temp.next.val == temp.val){
                temp.next = temp.next.next;
            }
            if(temp.next == null) return head;
            if(temp.next.val != temp.val){
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        //display(a);
        //displayRev(e);
        displayRandom(c);
        //Node newHead = insertAtHead(a,1);
        //display(newHead);

        //insertAtEnd(a,90);
        //insertAtIdx(a, 3, 77);
        //deleteAtIndex2(a,3);
        deleteDuplicates(a);
        display(a);
    }
}
