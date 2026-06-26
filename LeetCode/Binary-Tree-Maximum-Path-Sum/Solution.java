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
17    int res = Integer.MIN_VALUE;
18
19    public int support(TreeNode root){
20        if(root==null){
21            return 0;
22        }
23        
24        int left =  Math.max(0,support(root.left));
25        int right = Math.max(0,support(root.right));
26        
27        res  = Math.max(res,left+right+root.val);
28        return Math.max(left,right)+root.val;
29        
30
31          
32    }
33    public int maxPathSum(TreeNode root) {
34
35        support(root);
36        return  res;
37        
38
39        
40    }
41}