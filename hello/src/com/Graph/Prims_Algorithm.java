package com.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algorithm {
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v, int c){
            this.v = v;
            this.cost = c;
        }
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void createGraph11(ArrayList<Pair>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Pair(1, 10));
        graph[0].add(new Pair(2, 15));
        graph[0].add(new Pair(3, 30));
        graph[1].add(new Pair(0, 10));
        graph[1].add(new Pair(3, 40));
        graph[2].add(new Pair(0, 15));
        graph[2].add(new Pair(3, 50));
        graph[3].add(new Pair(0, 30));
        graph[3].add(new Pair(1, 40));
        graph[3].add(new Pair(2, 50));
    }
    public static void prims(ArrayList<Pair> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0)); // Start from vertex 0
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll(); // Get the edge with the smallest cost

            if (vis[curr.v]) continue; // Skip if already visited

            vis[curr.v] = true; // Mark the vertex as visited
            finalCost += curr.cost; // Add cost of the edge

            // Add all edges from the current vertex to the priority queue
            for (Pair e : graph[curr.v]) {
                if (!vis[e.v]) { // Only add edges to unvisited vertices
                    pq.add(new Pair(e.v, e.cost));
                }
            }
        }
        System.out.println("Total cost of the Minimum Spanning Tree is: " + finalCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Pair> graph[] = new ArrayList[V];
        createGraph11(graph);
        prims(graph);
    }
}
