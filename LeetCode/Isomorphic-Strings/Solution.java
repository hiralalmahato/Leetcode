1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3
4        if(s.length()!=t.length()){
5            return false;
6        }
7
8        int [] mapS = new int[256];
9        int [] mapT = new int [256];
10
11        for(int i = 0;i<s.length();i++){
12            char c1 = s.charAt(i);
13            char c2 = t.charAt(i);
14
15
16            if(mapS[c1]!=mapT[c2]){
17                return false;
18            }
19            mapS[c1]=i+1;
20            mapT[c2]=i+1;
21        }
22        return true;
23        
24    }
25}