1class Solution {
2    public String reverseWords(String s) {
3    
4
5    s = s.trim();
6
7    String[] words = s.split("\\s+");
8
9    int left = 0;
10    int right = words.length-1;
11
12    while(left<right){
13        String temp = words[left];
14        words[left] = words[right];
15        words[right] = temp;
16
17        left++;
18        right--;
19    }  
20    return String.join(" ",words);     
21        
22    }
23}