1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        if(nums.length==1){
4            return 0;
5        }
6
7        Arrays.sort(nums);
8        
9        int result = Integer.MAX_VALUE;
10        for(int i=0;i+k-1<nums.length;i++){
11            int minDiff = nums[i+k-1]-nums[i];
12
13            result = Math.min(result,minDiff);
14            
15            
16        }
17        return result;
18        
19    }
20}