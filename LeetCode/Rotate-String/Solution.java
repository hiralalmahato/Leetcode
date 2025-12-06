1class Solution {
2    public boolean rotateString(String s, String goal) {
3
4
5        if(s.length()!=goal.length()){
6            return false;
7        }
8
9        String s1 = s+s;
10
11        return s1.contains(goal);
12        
13    }
14}