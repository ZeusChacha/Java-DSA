package com.Queue2;

public class CircularMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        queue.remove();
        queue.display();
        queue.insert(133);
        queue.display();
    }
}
