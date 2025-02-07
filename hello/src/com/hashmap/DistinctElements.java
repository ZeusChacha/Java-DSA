package com.hashmap;

import java.util.HashSet;

public class DistinctElements {
    static int countDistinct(int a[]){
        HashSet<Integer> s = new HashSet<>();
        for (int elements : a){
            s.add(elements);
        }
        return s.size();
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,1,2,3,4,5,6,7,8,9};
        System.out.println(countDistinct(a));
    }
}
