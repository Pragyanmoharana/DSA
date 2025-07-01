class Solution {



public boolean dfs(List<List<Integer>> graph, int src, int dest, boolean[] vis){
    if (src == dest) return true;
    vis[src] = true;

    for (int i = 0; i < graph.get(src).size(); i++) {
        int neighbor = graph.get(src).get(i);
        if (!vis[neighbor] && dfs(graph, neighbor, dest, vis)) {
            return true;
        }
    }
    return false;
}




    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //step1-create the graph
         List<List<Integer>> graph=new ArrayList<>();
         for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
         }
         //step 2 add edges of(unidirected)
         for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
         }
         //step 3:Run DFS
          boolean[] vis=new boolean[n];
          return dfs(graph,source,destination,vis);
    }
}
