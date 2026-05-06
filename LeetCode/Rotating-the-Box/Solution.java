1
2class Solution {
3    public char[][] rotateTheBox(char[][] boxGrid) {
4        int m = boxGrid.length;        // original rows
5        int n = boxGrid[0].length;     // original cols
6
7      
8        char[][] result = new char[n][m];
9
10       
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                result[j][m - 1 - i] = boxGrid[i][j];
14            }
15        }
16
17       
18        int[] emptyIndex = new int[m];          
19        Arrays.fill(emptyIndex, n - 1);          
20
21        
22        for (int i = n - 1; i >= 0; i--) {       // i = row in rotated grid
23            for (int j = 0; j < m; j++) {        // j = col in rotated grid
24
25                if (result[i][j] == '#') {
26                    
27                    if (emptyIndex[j] != i) {
28                        result[emptyIndex[j]][j] = '#'; // move stone down
29                        result[i][j] = '.';             // leave empty behind
30                    }
31                    // Next stone in the same segment must stack above this one.
32                    emptyIndex[j]--;
33
34                } else if (result[i][j] == '*') {
35                    
36                    emptyIndex[j] = i - 1;
37                }
38
39            }
40        }
41
42        return result;
43    }
44}