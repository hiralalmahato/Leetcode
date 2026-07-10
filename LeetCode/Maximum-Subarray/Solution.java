1class Solution {
2    public int maxSubArray(int[] nums) {
3        
4        int sum = 0;
5        int maxi  = Integer.MIN_VALUE;
6
7        for(int num:nums){
8            
9            sum += num;
10            
11            maxi = Math.max(sum,maxi);
12            if(sum<0){
13                sum = 0;
14            }
15            
16        }
17        return maxi;
18
19        
20    }
21}