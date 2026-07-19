1class Solution {
2    public void reverseString(char[] s) {
3        int left =  0;
4        int right = s.length-1;
5
6
7        while(left<right){
8            char temp= s[left];
9            s[left] = s[right];
10            s[right] = temp;
11
12            left++;
13            right--;
14
15        }
16       
17        
18    }
19}