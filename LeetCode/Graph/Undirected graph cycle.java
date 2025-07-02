import java.util.*;

class Solution {

    private boolean dfsUtil(List<Integer>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;

        for (int neighbour : graph[curr]) {
            if (!vis[neighbour]) {
                if (dfsUtil(graph, vis, neighbour, curr)) {
                    return true;
                }
            } else if (neighbour != parent) {
                // Found a back edge → cycle exists
                return true;
            }
        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {
        // Create adjacency list
        List<Integer>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfsUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }

        return false;
    }
}
