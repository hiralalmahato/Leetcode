1class Solution {
2
3    public boolean possible(int mid, int k, int[] nums) {
4        int day = 1;
5        int weight = 0;
6        int n = nums.length;
7
8        for (int i = 0; i < n; i++) {
9            if (weight +  nums[i] > mid) {
10                day++;
11                weight = nums[i];
12            } else {
13                weight += nums[i];
14            }
15
16            if (day > k) {
17                return false;
18            }
19        }
20
21        return true;
22    }
23
24    public int splitArray(int[] nums, int k) {
25        int n = nums.length;
26        int capacity = Integer.MAX_VALUE;
27        int r = 0;
28        int l = 0;
29
30        for (int x : nums) {
31            r += x;
32            l = Math.max(l, x);
33        }
34
35        while (l <= r) {
36            int mid = l + (r - l) / 2;
37
38            if (possible(mid, k, nums)) {
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