class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[adj.size()];  
        ArrayList<Integer> result = new ArrayList<>();

        // Loop over all nodes to handle disconnected graphs
        for (int i = 0; i < adj.size(); i++) {
            if (!vis[i]) {
                dfsHelper(i, adj, vis, result);
            }
        }

        return result;
    }

    public static void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> result) {
        vis[node] = true;
        result.add(node);
        
        for (int neighbour : adj.get(node)) {
            if (!vis[neighbour]) {
                dfsHelper(neighbour, adj, vis, result);
            }
        }
    }
}
