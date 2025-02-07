package com.linearalgo;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "AnkitDON";
        System.out.println(Arrays.toString(name.toCharArray()));
        String target = "t";
    }
    static boolean search(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }


    static boolean search2(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
