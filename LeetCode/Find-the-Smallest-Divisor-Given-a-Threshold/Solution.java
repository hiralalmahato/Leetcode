1class Solution {
2
3    long sumbyd(int[] nums, int divisor) {
4        long sum = 0;
5        int n = nums.length;
6
7        for (int i = 0; i < n; i++) {
8            sum += (nums[i] + divisor - 1) / divisor; // ceil without Math.ceil
9            if (sum > Integer.MAX_VALUE) return sum;  // early stop to avoid unnecessary work
10        }
11        return sum;
12    }
13
14    public int smallestDivisor(int[] nums, int threshold) {
15        int low = 1;
16        int high = 0;
17        for (int num : nums) {
18            high = Math.max(high, num);
19        }
20        int ans = -1;
21        while (low <= high) {
22            int mid = low + (high - low) / 2;
23
24            if (sumbyd(nums, mid) <= threshold) {
25                ans = mid;
26                high = mid - 1;
27            } else {
28                low = mid + 1;
29            }
30        }
31        return ans;
32    }
33}
34