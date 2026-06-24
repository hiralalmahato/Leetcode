1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int n  = matrix.length;
5        int m = matrix[0].length;
6
7        int row = 0;
8        int col = m-1;
9
10
11        while(row < n && col >= 0){
12            if(matrix[row][col] < target){
13                row++;
14            }
15            else if(matrix[row][col]> target){
16                col--;
17
18            }
19            else if(matrix[row][col]==target){
20
21                   return true;            }
22        }
23        return false;
24
25
26
27        
28    }
29}
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71//  int rows = matrix.length;
72//         int cols = matrix[0].length;
73
74//         int row = 0;         
75//         int col = cols - 1;  
76
77//         while (row < rows && col >= 0) {
78//             int value = matrix[row][col];
79
80//             if (value == target) {
81//                 return true; 
82//             }
83//             else if (value > target) {
84//                 col--;        
85//             }
86//             else {
87//                 row++;       
88//             }
89//         }
90//         return false; 
91