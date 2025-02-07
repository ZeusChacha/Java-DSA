package com.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgo {
    static class Pair implements Comparable<Pair> {
        int dest; // Destination node
        int path; // Distance from the source

        public Pair(int dest, int path) {
            this.dest = dest;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return Integer.compare(this.path, p2.path);
        }
    }

    public static void createGraph9(ArrayList<Pair>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Creating edges in the graph with weights
        graph[0].add(new Pair(1, 2)); // Edge 0 -> 1 with weight 2
        graph[0].add(new Pair(2, 4)); // Edge 0 -> 2 with weight 4
        graph[1].add(new Pair(2, 1)); // Edge 1 -> 2 with weight 1
        graph[1].add(new Pair(3, 7)); // Edge 1 -> 3 with weight 7
        graph[2].add(new Pair(4, 3)); // Edge 2 -> 4 with weight 3
        graph[3].add(new Pair(5, 1)); // Edge 3 -> 5 with weight 1
        graph[4].add(new Pair(3, 2)); // Edge 4 -> 3 with weight 2
        graph[4].add(new Pair(5, 5)); // Edge 4 -> 5 with weight 5
    }

    public static void dijkstra(ArrayList<Pair>[] graph, int src) {
        int[] dist = new int[graph.length];
        boolean[] vis = new boolean[graph.length];

        // Initialize distances
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.dest; // Current node

            if (vis[u]) continue; // Skip if already visited
            vis[u] = true;

            // Explore all neighbors
            for (Pair e : graph[u]) {
                int v = e.dest; // Neighbor node
                int wt = e.path; // Weight of the edge

                // Relaxation step
                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        // Print the results
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Distance from node " + src + " to node " + i + " is " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int src = 0;
        int V = 6; // Number of nodes
        ArrayList<Pair>[] graph = new ArrayList[V];
        createGraph9(graph);
        dijkstra(graph, src);
    }
}


//public class DijkstraAlgo {
//    static class Pair implements Comparable<Pair>{
//        int n;
//        int path;
//
//        public Pair(int n, int path){
//            this.n = n;
//            this.path = path;
//
//        }
//        public int compareTo(Pair p2){
//            return this.path - p2.path;
//        }
//    }
//    public static void createGraph9(ArrayList<Pair> graph[]){
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//        graph[0].add(new Pair(0,1, 2));
//        graph[0].add(new Pair(0,2, 4));
//        graph[1].add(new Pair(1,2, 1));
//        graph[1].add(new Pair(1,3, 7));
//        graph[2].add(new Pair(2,4, 3));
//        graph[4].add(new Pair(4,3, 2));
//        graph[4].add(new Pair(4,5, 5));
//        graph[3].add(new Pair(3,5, 1));
//    }
//
//    public static void dijkstra(ArrayList<Pair>[] graph, int src) {
//        int dist[] = new int[graph.length];
//        for (int i = 0; i < graph.length; i++) {
//            if (i != src){
//                dist[i] = Integer.MAX_VALUE;
//            }
//        }
//        boolean vis[] = new boolean[graph.length];
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//        pq.add(new Pair(src, 0));
//        while(!pq.isEmpty()){
//            Pair curr = pq.remove();
//            if (!vis[curr.n]){
//                vis[curr.n] = true;
//                for (int i = 0; i < graph[curr.n].size(); i++) {
//                    Pair e = graph[curr.n].get(i);
//                    int u = e.src;
//                    int v = e.dest;
//                    int wt = e.wt;
//                    if (dist[u] + wt < dist[v]){
//                        dist[v] = dist[u] + wt;
//                        pq.add(new Pair(v, dist[u]));
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < dist.length; i++) {
//            System.out.println(dist[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int src = 0;
//        int V = 6;
//        ArrayList<Pair> graph[] = new ArrayList[V];
//        createGraph9(graph);
//        dijkstra(graph, src);
//    }
//}
