1class Solution {
2    final static int MAX = 300005;
3
4    public int earliestFinishTime(int[] la, int[] lb, int[] wa, int[] wb) {
5        int l = MAX, w = MAX, minL = MAX, minW = MAX;
6        int n = la.length, m = wa.length;
7
8        for (int i = 0; i < n; ++i)
9            l = Math.min(l, la[i] + lb[i]);
10
11        for (int i = 0; i < m; ++i) {
12            w = Math.min(w, wa[i] + wb[i]);
13            minL = Math.min(minL, Math.max(wa[i], l) + wb[i]);
14        }
15
16        for (int i = 0; i < n; ++i)
17            minW = Math.min(minW, Math.max(la[i], w) + lb[i]);
18
19        return Math.min(minW, minL);
20    }
21}