1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4
5        ArrayList<Integer> ans = new ArrayList<>();
6
7        for(int num:nums){
8            map.put(num,map.getOrDefault(num,0)+1);
9        }
10
11        for(int num:nums){
12            if(map.get(num)==2){
13                ans.add(num);
14
15                map.put(num,1);
16            }
17        }
18
19        return ans;
20        
21        
22    }
23}