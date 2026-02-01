1class Solution {
2    public int minimumCost(int[] nums) {
3
4        int first = nums[0];
5        int min1 = Integer.MAX_VALUE;
6        int min2 = Integer.MAX_VALUE;
7
8        for(int i = 1;i<nums.length ;i++){
9
10           if(nums[i]<min1){
11            min2 = min1;
12            min1 = nums[i];
13
14           }
15           else if(nums[i]<min2){
16            min2 = nums[i];
17           }
18            
19
20
21        }
22        return first + min1+ min2;
23
24        
25        
26        
27    }
28}