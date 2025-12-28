1class Solution {
2    public int countNegatives(int[][] grid) {
3
4        // int row = grid.length;
5        // int col = grid[0].length;
6        //  int count = 0;
7        // for(int i = 0;i<row;i++){
8        //     for(int j = 0 ;j<col;j++){
9               
10        //         if(grid[i][j]<0){
11        //             count++;
12        //         }
13        //     }
14        // }
15        // return count;
16
17        int m = grid.length;
18        int n = grid[0].length;
19
20        int row = 0;
21        int col = n-1;
22
23        int count = 0;
24        while(row<m && col>=0){
25            if(grid[row][col]<0){
26                count += (m-row);
27                col--;
28            }
29            else{
30                row++;
31            }
32        }
33        return count ;
34       
35    }
36}