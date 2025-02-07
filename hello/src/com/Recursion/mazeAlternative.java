package com.Recursion;

public class mazeAlternative {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        //twoPath(1,1,rows,cols,"");
        boolean[][] isVisited = new boolean[rows][cols];
        //fourPath(0,0,rows-1,cols-1,"",isVisited);
        obstaclefourPath(0,0,rows-1,cols-1,"" ,maze,isVisited);
    }
    private static void twoPath(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        //go right
        twoPath(sr, sc+1, er, ec, s+"R");
        //go down
        twoPath(sr+1, sc, er, ec, s+"D");
    }
    private static void fourPath(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if (isVisited[sr][sc]) return;
        isVisited[sr][sc] = true;
        //go right
        fourPath(sr, sc+1, er, ec, s+"R", isVisited);
        //go down
        fourPath(sr+1, sc, er, ec, s+"D", isVisited);
        //go left
        fourPath(sr, sc-1, er, ec, s+"L", isVisited);
        //go up
        fourPath(sr-1, sc, er, ec, s+"U", isVisited);
        isVisited[sr][sc] = false;
    }
    private static void obstaclefourPath(int sr, int sc, int er, int ec,String s, int[][] maze, boolean[][] isVisited) {
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) return;
        if (isVisited[sr][sc]) return;
        isVisited[sr][sc] = true;
        //go right
        obstaclefourPath(sr, sc+1, er, ec, s+"R",maze , isVisited);
        //go down
        obstaclefourPath(sr+1, sc, er, ec, s+"D",maze , isVisited);
        //go left
        obstaclefourPath(sr, sc-1, er, ec, s+"L",maze , isVisited);
        //go up
        obstaclefourPath(sr-1, sc, er, ec, s+"U",maze , isVisited);
        isVisited[sr][sc] = false;
    }
}
