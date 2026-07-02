1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int [][]dp = new int [m][n];
6        for(int[]x:dp) Arrays.fill(x,-1);
7
8        return helper(grid,0,0,dp);
9                
10    }
11
12    public int helper(int[][]grid, int r, int c,int[][]dp){
13        if(r>=grid.length || c>=grid[0].length ){
14            return (int)1e9;
15        }
16        if(r==grid.length-1 && c==grid[0].length-1){
17            return grid[r][c];
18        }
19        if(dp[r][c]!= -1){
20            return dp[r][c];
21        }
22
23        int right = helper(grid,r,c+1,dp);
24        int down  =helper(grid,r+1,c,dp);
25
26        int minSum = Math.min(right,down)+grid[r][c];
27
28        dp[r][c] = minSum;
29        return dp[r][c];
30    }
31}