1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19
20        if (root == null) {
21            return ans;
22        }
23
24        Queue<TreeNode> queue = new LinkedList<>();
25        queue.offer(root);  
26
27        while (!queue.isEmpty()) {
28            int size = queue.size();
29
30            for (int i = 0; i < size; i++) {
31                TreeNode node = queue.poll();  
32
33                if (node.left != null) {
34                    queue.offer(node.left);     
35                }
36
37                if (node.right != null) {
38                    queue.offer(node.right);    
39                }
40
41                if (i == size - 1) {            
42                    ans.add(node.val);
43                }
44            }
45        }
46
47        return ans;
48    }
49}