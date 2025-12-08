1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if(s.length() != t.length()){
5            return false;
6        }
7
8        char[] a = s.toCharArray();
9        char[] b = t.toCharArray();
10
11        Arrays.sort(a);
12        Arrays.sort(b);
13
14        return Arrays.equals(a,b);
15
16        
17    }
18}