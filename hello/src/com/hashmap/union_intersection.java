package com.hashmap;

import java.util.Arrays;
import java.util.HashSet;



public class union_intersection {
    static HashSet<Integer> union(int[] a, int[] b){
        HashSet<Integer> s = new HashSet<>();
        for (int x : a){
            s.add(x);
        }
        for (int x : b){
            s.add(x);
        }
        return s;
    }
    static int intersection(int[] a, int[] b){//static satement me hasheset isliye lagaya taki wo elements bhi return kare not only the size
        HashSet<Integer> s = new HashSet<>();
        int count = 0;
        for (int x : a){
            s.add(x);
        }
        for (int x : b){
            if (s.contains(x)){
                count++;
                s.remove(x);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={7,3,9};
        int b[]={6,3,9,2,9,4};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("union of a & b is ----");
        System.out.println(union(a,b));
        System.out.println("intersection of a & b is ----");
        System.out.println(intersection(a,b));
    }
}
