1class Solution {
2
3    // Function to calculate total hours needed at speed 'k'
4    private long hoursTaken(int[] piles, int k) {
5        long total = 0;
6        for (int pile : piles) {
7            total += (pile + k - 1) / k;  // ceil division
8        }
9        return total;
10    }
11
12    public int minEatingSpeed(int[] piles, int h) {
13
14        // find search boundaries
15        int low = 1;
16        int high = 0;
17        for (int pile : piles) {
18            high = Math.max(high, pile);
19        }
20
21        int ans = high;
22
23        // binary search
24        while (low <= high) {
25            int mid = low + (high - low) / 2;
26
27            long hours = hoursTaken(piles, mid);
28
29            if (hours <= h) {
30                ans = mid;        // speed works → try smaller
31                high = mid - 1;
32            } else {
33                low = mid + 1;    // too slow → increase speed
34            }
35        }
36        return ans;
37    }
38}
39