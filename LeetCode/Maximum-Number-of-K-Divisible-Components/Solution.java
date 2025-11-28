1class Solution {
2    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
3       
4        List<List<Integer>> graph = new ArrayList<>();
5        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
6
7        for(int[] e : edges) {
8            graph.get(e[0]).add(e[1]);
9            graph.get(e[1]).add(e[0]);
10        }
11
12        int[] ans = new int[1]; 
13
14        dfs(0, -1, graph, values, k, ans);
15
16        return ans[0];
17    }
18
19    private long dfs(int node, int parent, List<List<Integer>> graph,
20                     int[] values, int k, int[] ans) {
21
22        long sum = values[node];  // subtree sum starts with node value
23
24        for(int child : graph.get(node)) {
25            if(child == parent) continue;
26            sum += dfs(child, node, graph, values, k, ans);
27        }
28
29        // If the subtree sum is divisible by k -> form a component
30        if(sum % k == 0) {
31            ans[0]++;  
32            return 0;  // detach from parent
33        }
34
35        return sum;  
36    }
37}
38