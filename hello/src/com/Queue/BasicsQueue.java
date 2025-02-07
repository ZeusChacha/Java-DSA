package com.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicsQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        q.remove();
        //q.poll();//same as q.remove()
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());//same as q.element()
    }
}
