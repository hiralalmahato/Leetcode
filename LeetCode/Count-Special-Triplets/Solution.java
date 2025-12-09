1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int specialTriplets(int[] nums) {
6        int MOD = 1_000_000_007;
7        Map<Integer, Integer> left = new HashMap<>();
8        Map<Integer, Integer> right = new HashMap<>();
9        for (int x : nums) {
10            right.merge(x, 1, Integer::sum);
11        }
12        long result = 0;
13        for (int x : nums) {
14            // remove current x from "right" (now it's middle candidate)
15            right.merge(x, -1, Integer::sum);
16
17            long needed = x * 2L;  // target value for i and k
18            long lc = left.getOrDefault((int)needed, 0);
19            long rc = right.getOrDefault((int)needed, 0);
20            result = (result + lc * rc) % MOD;
21
22            // add current x to left (for future iterations)
23            left.merge(x, 1, Integer::sum);
24        }
25        return (int) result;
26    }
27}
28