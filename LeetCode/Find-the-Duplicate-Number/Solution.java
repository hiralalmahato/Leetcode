1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> ans = new HashSet<>();
4
5
6        for(int num:nums){
7            if(ans.contains(num)){
8                return num;
9            }
10            else{
11                ans.add(num);
12            }
13        }
14        return -1;
15
16        
17
18
19        
20    }
21}
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43