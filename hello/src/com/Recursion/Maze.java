package com.Recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(count(3, 3));
        path2("", 3, 3);
        System.out.println(pathArray("", 3, 3));
        //pathDiagonal("", 3, 3);
        System.out.println(pathDiagonalArray("", 3, 3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("", board, 0, 0);
    }
    static int count(int r, int c){
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    static void path2(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path2(p + 'D', r-1, c);

        }

        if (c > 1) {
            path2(p + 'R', r, c-1);
        }
    }
    static ArrayList<String> pathArray(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathArray(p + 'D', r - 1, c));
        }
        if (c > 1){
            list.addAll(pathArray(p + 'R', r, c - 1));
        }
        return list;
    }
    static void pathDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1){
            pathDiagonal(p + 'D', r-1, c-1);
        }
        if (r > 1){
            pathDiagonal(p + 'V', r-1, c);
        }
        if (c > 1){
            pathDiagonal(p + 'H', r, c-1);
        }
    }
    static ArrayList<String> pathDiagonalArray(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1){
            list.addAll(pathDiagonalArray(p + 'D', r-1, c-1));
        }
        if (r > 1){
            list.addAll(pathDiagonalArray(p + 'V', r-1, c));
        }
        if (c > 1){
            list.addAll(pathDiagonalArray(p + 'H', r, c-1));
        }
        return list;
    }
    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length-1){
            pathRestrictions(p + 'D', maze, r+1, c);
        }
        if (c < maze[0].length-1){
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }
}
