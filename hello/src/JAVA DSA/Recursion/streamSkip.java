package com.Recursion;

public class streamSkip {
    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println();
        System.out.println(skip2("baccdah"));
        System.out.println();
        System.out.println(skipApple("bacapplecdah"));
        System.out.println();
        System.out.println(skipAppNotApple("bacapplcdah"));
    }
    static void skip(String p, String up){

        if (up.isEmpty()) {
            System.out.println("This program skips char a in the given string");
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skip2(String up){

        if (up.isEmpty()) {
            System.out.println("Same as above just written using single variable");
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            return skip2(up.substring(1));
        }
        else{
            return ch + skip2(up.substring(1));
        }
    }
    static String skipApple(String up){

        if (up.isEmpty()) {
            System.out.println("This program skips the string apple in the given group of character");
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){

        if (up.isEmpty()){
            System.out.println("This program will only skip app not apple if apple present in the string then it will not skip anything");
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        return up.charAt(0) + skipAppNotApple(up.substring(1));
    }
}
