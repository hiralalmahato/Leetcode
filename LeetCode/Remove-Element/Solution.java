1class Solution {
2    public int removeElement(int[] nums, int val) {
3        
4        //k means index
5        int k = 0;
6
7        for(int i =  0;i<nums.length;i++){
8            if(nums[i]!= val){
9                nums[k] = nums[i];
10                k++;
11            }
12        }
13        return k;
14    }
15}