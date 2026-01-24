1class Solution {
2    public int minPairSum(int[] nums) {
3
4        Arrays.sort(nums);
5        int left = 0;
6        int right = nums.length-1;
7
8        int maxSum = 0;
9
10        while(left<right){
11            int pairSum = nums[left] + nums[right];
12
13            maxSum = Math.max(maxSum,pairSum);
14
15            left++;
16            right--;
17
18        }
19        return maxSum;
20        
21    }
22}