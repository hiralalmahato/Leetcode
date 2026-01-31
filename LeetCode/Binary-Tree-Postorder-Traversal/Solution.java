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
17
18    List<Integer> result =new ArrayList<>();
19    public List<Integer> postorderTraversal(TreeNode root) {
20
21        postOrder(root);
22        return result;
23        
24    }
25
26    public void postOrder(TreeNode root){
27
28        if(root==null){
29            return ;
30        }
31
32        postOrder(root.left);
33        postOrder(root.right);
34        result.add(root.val);
35
36    }
37
38    
39}