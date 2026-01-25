class Solution {
    
    int[] parent;
    int[] rank;
    
    public boolean isCycle(int V, int[][] edges) {
        parent = new int[V];
        rank = new int[V];
        
        // Initialize DSU
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        
        // Process each edge
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            int pu = find(u);
            int pv = find(v);
            
            // If both vertices have same parent → cycle
            if (pu == pv) {
                return true;
            }
            
            union(pu, pv);
        }
        
        return false;
    }
    
    // Find with path compression
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    // Union by rank
    private void union(int x, int y) {
        if (rank[x] < rank[y]) {
            parent[x] = y;
        } else if (rank[x] > rank[y]) {
            parent[y] = x;
        } else {
            parent[y] = x;
            rank[x]++;
        }
    }
}
