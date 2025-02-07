package com.Recursion;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        //seq("", "abc");
       // System.out.println(seqArray("", "abc"));
        seqASCII("", "ab");
        System.out.println(seqASCIIarray("", "abc"));

    }
    static void seq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        seq(p + ch, up.substring(1));
        seq(p, up.substring(1));
    }

     //same o/p just in array format
    static ArrayList<String> seqArray(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> right = seqArray(p + ch, up.substring(1));
        ArrayList<String> left = seqArray(p, up.substring(1));
        right.addAll(left);
        return right;
    }
    static void seqASCII(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        seqASCII(p+ch, up.substring(1));
        seqASCII(p, up.substring(1));
        seqASCII(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> seqASCIIarray(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new  ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
       ArrayList<String> first = seqASCIIarray(p+ch, up.substring(1));
       ArrayList<String> second = seqASCIIarray(p, up.substring(1));
       ArrayList<String> third = seqASCIIarray(p+(ch+0), up.substring(1));

       first.addAll(second);
       first.addAll(third);
       return first;
    }
}
