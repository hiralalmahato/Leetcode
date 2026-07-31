1class Solution {
2    public int missingNumber(int[] nums) {
3        
4
5        int n = nums.length;
6
7        int mis =  n*(n+1)/2;
8
9        for(int num:nums){
10            mis =  mis-num;
11        }
12
13        return mis;
14
15
16        
17        
18    }
19}