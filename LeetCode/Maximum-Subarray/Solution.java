1class Solution {
2    public int maxSubArray(int[] nums) {
3        
4        int sum = 0;
5        int maxi  = Integer.MIN_VALUE;
6
7        for(int num:nums){
8            sum += num;
9            maxi = Math.max(sum,maxi);
10            if(sum<0){
11                sum = 0;
12            }
13        }
14        return maxi;
15
16        
17    }
18}