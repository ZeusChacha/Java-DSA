package com.hashmap;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
        if (s.contains(3)){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
        s.remove(2);
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);
    }
}
