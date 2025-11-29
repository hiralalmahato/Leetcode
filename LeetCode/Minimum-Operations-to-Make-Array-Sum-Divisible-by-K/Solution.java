1class Solution {
2    public int minOperations(int[] nums, int k) {
3
4        int sum = 0;
5
6        for(int x:nums){
7            sum += x;
8
9        }
10        int rem = sum % k;
11
12        if(rem==0){
13            return 0;
14        }
15        return rem;
16        
17    }
18}