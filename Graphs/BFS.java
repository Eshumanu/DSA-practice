// package Graphs;

// import java.util.LinkedList;

// import java.util.HashMap;
// import java.util.Queue;

// public class BFS {
//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         System.out.println(q());
//     }

// }
package Graphs;

import java.util.*;

public class BFS {
    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // graph edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        // start node
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            // 1. take from queue
            int node = q.poll();

            // 2. print
            System.out.print(node + " ");

            // 3. add neighbors
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
}