1class Solution {
2
3    public boolean possible(int mid, int days, int[] weights) {
4        int day = 1;
5        int weight = 0;
6        int n = weights.length;
7
8        for (int i = 0; i < n; i++) {
9            if (weight + weights[i] > mid) {
10                day++;
11                weight = weights[i];
12            } else {
13                weight += weights[i];
14            }
15
16            if (day > days) {
17                return false;
18            }
19        }
20
21        return true;
22    }
23
24    public int shipWithinDays(int[] weights, int days) {
25        int n = weights.length;
26        int capacity = Integer.MAX_VALUE;
27        int r = 0;
28        int l = 0;
29
30        for (int x : weights) {
31            r += x;
32            l = Math.max(l, x);
33        }
34
35        while (l <= r) {
36            int mid = l + (r - l) / 2;
37
38            if (possible(mid, days, weights)) {
39                capacity = mid;
40                r = mid - 1;
41            } else {
42                l = mid + 1;
43            }
44        }
45
46        return capacity;
47    }
48}