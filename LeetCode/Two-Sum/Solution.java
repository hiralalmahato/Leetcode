1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        // for (int i = 0; i < nums.length; i++) {
4        //     for (int j = i + 1; j < nums.length; j++) {
5        //         if (nums[j] == target - nums[i]) {
6        //             return new int[] { i, j };
7        //         }
8        //     }
9        // }
10      
11        // return new int[] {};
12
13        HashMap<Integer,Integer> map = new HashMap<>();
14
15        for(int i = 0;i<nums.length;i++){
16            int complement = target - nums[i];
17
18            if(map.containsKey(complement)){
19                return new int[]{map.get(complement),i};
20
21            }
22
23            map.put(nums[i],i);
24        }
25        return new int[]{};
26    }
27}