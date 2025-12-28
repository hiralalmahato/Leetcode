1class Solution {
2    public int countNegatives(int[][] grid) {
3
4        int row = grid.length;
5        int col = grid[0].length;
6         int count = 0;
7        for(int i = 0;i<row;i++){
8            for(int j = 0 ;j<col;j++){
9               
10                if(grid[i][j]<0){
11                    count++;
12                }
13            }
14        }
15        return count;
16       
17    }
18}