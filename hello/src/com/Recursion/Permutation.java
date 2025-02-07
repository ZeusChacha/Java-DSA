package com.Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        //permutationAlgo("", "abc");
       // ArrayList<String> ans = permutationList("", "abc");
        //System.out.println(ans);
        System.out.println(permutationCount("", "abc"));
    }
    static void permutationAlgo(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutationAlgo(f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f+ch+s, up.substring(1)));
        }
        return ans;
    }
    static int permutationCount(String p, String up){
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
