1
2class Solution {
3
4    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
5    int m, n;
6    int[][] fireTime;
7
8    public int maximumMinutes(int[][] grid) {
9        m = grid.length;
10        n = grid[0].length;
11
12        computeFireTime(grid);
13
14        int left = -1;
15        int right = m * n;
16
17        while (left < right) {
18            int mid = left + (right - left + 1) / 2;
19
20            if (canReach(grid, mid)) {
21                left = mid;
22            } else {
23                right = mid - 1;
24            }
25        }
26
27        return left == m * n ? 1000000000 : left;
28    }
29
30    private void computeFireTime(int[][] grid) {
31        fireTime = new int[m][n];
32
33        for (int[] row : fireTime) {
34            Arrays.fill(row, Integer.MAX_VALUE);
35        }
36
37        Queue<int[]> q = new LinkedList<>();
38
39        for (int i = 0; i < m; i++) {
40            for (int j = 0; j < n; j++) {
41                if (grid[i][j] == 1) {
42                    fireTime[i][j] = 0;
43                    q.offer(new int[]{i, j});
44                }
45            }
46        }
47
48        while (!q.isEmpty()) {
49            int[] cur = q.poll();
50            int x = cur[0];
51            int y = cur[1];
52
53            for (int[] d : dirs) {
54                int nx = x + d[0];
55                int ny = y + d[1];
56
57                if (nx < 0 || ny < 0 || nx >= m || ny >= n)
58                    continue;
59
60                if (grid[nx][ny] == 2)
61                    continue;
62
63                if (fireTime[nx][ny] != Integer.MAX_VALUE)
64                    continue;
65
66                fireTime[nx][ny] = fireTime[x][y] + 1;
67                q.offer(new int[]{nx, ny});
68            }
69        }
70    }
71
72    private boolean canReach(int[][] grid, int wait) {
73
74        if (wait >= fireTime[0][0])
75            return false;
76
77        Queue<int[]> q = new LinkedList<>();
78        boolean[][] visited = new boolean[m][n];
79
80        q.offer(new int[]{0, 0, wait});
81        visited[0][0] = true;
82
83        while (!q.isEmpty()) {
84            int[] cur = q.poll();
85
86            int x = cur[0];
87            int y = cur[1];
88            int time = cur[2];
89
90            if (x == m - 1 && y == n - 1)
91                return true;
92
93            for (int[] d : dirs) {
94                int nx = x + d[0];
95                int ny = y + d[1];
96                int nt = time + 1;
97
98                if (nx < 0 || ny < 0 || nx >= m || ny >= n)
99                    continue;
100
101                if (grid[nx][ny] == 2 || visited[nx][ny])
102                    continue;
103
104                if (nx == m - 1 && ny == n - 1) {
105                    if (nt <= fireTime[nx][ny]) {
106                        visited[nx][ny] = true;
107                        q.offer(new int[]{nx, ny, nt});
108                    }
109                } else {
110                    if (nt < fireTime[nx][ny]) {
111                        visited[nx][ny] = true;
112                        q.offer(new int[]{nx, ny, nt});
113                    }
114                }
115            }
116        }
117
118        return false;
119    }
120}