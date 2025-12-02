1class Solution {
2
3    private boolean canPlace(int[] position, int m, int dist) {
4        int count = 1; 
5        int last = position[0];
6
7        for (int i = 1; i < position.length; i++) {
8            if (position[i] - last >= dist) {
9                count++;
10                last = position[i];
11            }
12            if (count == m) return true;
13        }
14        return false;
15    }
16
17    public int maxDistance(int[] position, int m) {
18        Arrays.sort(position);
19
20        int low = 1;
21        int high = position[position.length - 1] - position[0];
22        int ans = 0;
23
24        while (low <= high) {
25            int mid = low + (high - low) / 2;
26
27            if (canPlace(position, m, mid)) {
28                ans = mid;
29                low = mid + 1;
30            } else {
31                high = mid - 1;
32            }
33        }
34        return ans;
35    }
36}
37