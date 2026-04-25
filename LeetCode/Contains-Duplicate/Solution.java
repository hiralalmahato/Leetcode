1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3    
4    HashSet<Integer> set = new HashSet<>();
5
6    for(int num:nums){
7        if(set.contains(num)){
8            return true;
9        }
10        set.add(num);
11    }
12    return false;
13        
14    }
15}