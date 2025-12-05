1class Solution {
2    public String reverseWords(String s) {
3    
4
5    s = s.trim() ;   
6
7    String[] words = s.split("\\s+");
8    int left = 0;
9    int right = words.length-1;
10
11    while(left<right) {
12        String temp = words[left];
13        words[left] = words[right];
14        words[right] = temp;
15
16        left++;
17        right--;
18    } 
19    return String.join(" ",words);         
20        
21    }
22}