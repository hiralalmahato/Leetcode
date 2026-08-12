1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        HashMap<Integer,Integer> result = new HashMap<>();
4        int i = 0;
5        int ans = 0;
6
7        for(int j=0;j<nums.length;j++){
8            result.put(nums[j],result.getOrDefault(nums[j],0)+1);
9
10            while(result.get(nums[j]) > k ){
11
12                result.put(nums[i],result.get(nums[i])-1);
13                i++;
14
15            }
16            ans = Math.max(ans,j-i+1);
17        }
18        return ans;
19        
20    }
21}