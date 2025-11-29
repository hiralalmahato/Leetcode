1class Solution {
2
3    public boolean possible(int[] bloomDay, int days, int m, int k) {
4
5        int count = 0;
6        int bouquets = 0;
7
8        int n = bloomDay.length;
9
10        for (int i = 0; i < n; i++) {
11            if (bloomDay[i] <= days) {
12                count++;
13            } else {
14                bouquets += (count / k);
15                count = 0;
16            }
17        }
18        bouquets += (count / k);
19
20        if (bouquets >= m) {
21            return true;
22        } else {
23            return false;
24        }
25    }
26
27
28    public int minDays(int[] bloomDay, int m, int k) {
29
30        int n = bloomDay.length;
31
32        // Use long to avoid integer overflow
33        if ((long) m * k > n) {
34            return -1;
35        }
36
37        int low = Integer.MAX_VALUE;
38        int high = Integer.MIN_VALUE;
39        int ans = -1;
40
41        // find min and max
42        for (int x : bloomDay) {
43            low = Math.min(low, x);
44            high = Math.max(high, x);
45        }
46
47        while (low <= high) {
48            int mid = (low + high) / 2;
49
50            if (possible(bloomDay, mid, m, k) == true) {
51                ans = mid;
52                high = mid - 1;
53            } else {
54                low = mid + 1;
55            }
56        }
57
58        return ans;
59    }
60}
61