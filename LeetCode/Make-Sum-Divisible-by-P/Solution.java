1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        long total = 0;
4        for (int x : nums) total += x;
5
6        long rem = total % p;
7        if (rem == 0) return 0;
8
9        HashMap<Long, Integer> map = new HashMap<>();
10        map.put(0L, -1);
11
12        long prefix = 0;
13        int ans = nums.length;
14
15        for (int i = 0; i < nums.length; i++) {
16            prefix = (prefix + nums[i]) % p;
17
18            long target = (prefix - rem + p) % p;
19
20            if (map.containsKey(target)) {
21                ans = Math.min(ans, i - map.get(target));
22            }
23
24            map.put(prefix, i);
25        }
26
27        return ans == nums.length ? -1 : ans;
28    }
29}
30