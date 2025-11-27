1class Solution {
2    public long maxSubarraySum(int[] nums, int k) {
3        int n = nums.length;
4        long[] minPref = new long[k];
5        Arrays.fill(minPref, Long.MAX_VALUE);
6
7        long prefix = 0, ans = Long.MIN_VALUE;
8        minPref[0] = 0;
9
10        for (int i = 0; i < n; i++) {
11            prefix += nums[i];
12            int mod = (i + 1) % k;
13
14            if (minPref[mod] != Long.MAX_VALUE) {
15                ans = Math.max(ans, prefix - minPref[mod]);
16            }
17
18            minPref[mod] = Math.min(minPref[mod], prefix);
19        }
20
21        return ans;
22    }
23}
24