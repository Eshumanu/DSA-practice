package Graphs;

import java.util.*;

public class DFS {
    public static void main(String args[]) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());

        }
        // Graph Edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        boolean[] visited = new boolean[v];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        while (!s.isEmpty()) {
            int node = s.pop();
            if (!visited[node]) {
                visited[node] = true;
                System.out.println(node + "");

            }
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    s.push(neighbor);
                }
            }
        }

    }

}
