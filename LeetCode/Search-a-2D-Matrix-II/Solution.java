1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        int row = 0;          // start at the first row
7        int col = cols - 1;   // start at the last column (top-right corner)
8
9        while (row < rows && col >= 0) {
10            int value = matrix[row][col];
11
12            if (value == target) {
13                return true;  // target found
14            }
15            else if (value > target) {
16                col--;        // move left
17            }
18            else {
19                row++;        // move down
20            }
21        }
22        return false;  // target not found
23    }
24}
25