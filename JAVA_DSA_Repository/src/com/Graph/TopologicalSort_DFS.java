package com.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort_DFS {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph7(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
    }
    public static boolean topSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop() + " ");
        }
        return false;
    }
    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph7(graph);
        topSort(graph);
    }
}
