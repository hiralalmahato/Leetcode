1class Solution {
2
3    private int smNumber(int[][]matrix,int x){
4        int n = matrix.length;
5        int count = 0;
6        int row = n-1;
7        int col = 0;
8
9        while(row >= 0 && col <n ){
10            if(matrix[row][col] <= x){
11                count += (row + 1);
12                col ++;
13            }else{
14                row--;
15            }
16        }
17        return count;
18
19
20    }
21
22    public int kthSmallest(int[][] matrix, int k) {
23        int n = matrix.length;
24        int m  =matrix[0].length;
25
26
27        int left = matrix[0][0];
28        int right = matrix[n-1][m-1];
29
30        while(left <= right){
31            int mid = left + (right - left)/2;
32
33            if(smNumber(matrix,mid)<k){
34                left = mid +1;
35
36            }else{
37                right = mid -1;
38            }
39        }
40        return left;
41
42        
43    }
44}