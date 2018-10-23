class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {        
        bfs(graph, 0, new ArrayList<Integer>());
        
        return result;
    }
    
    private void bfs(int[][] graph, int node, List<Integer> list) {        
        list.add(node);
        
        if (node == graph.length - 1) {
            // Found path to last node
            result.add(list);
        } else {
            for (int n: graph[node]) {
                bfs(graph, n, new ArrayList<>(list));
            }
        }
    }
}