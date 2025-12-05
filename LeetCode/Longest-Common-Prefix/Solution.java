1import java.util.Scanner;
2class Solution {
3    public String longestCommonPrefix(String[] strs) {
4        if(strs.length == 0) return "";
5
6        String prefix = strs[0];
7        for(int i  =1;i<strs.length;i++){
8            while(strs[i].indexOf(prefix)!= 0 ){
9                prefix = prefix.substring(0,prefix.length() - 1);
10                if (prefix.isEmpty()) return "";
11            }
12        }
13        return prefix;
14
15        
16    }
17   
18}