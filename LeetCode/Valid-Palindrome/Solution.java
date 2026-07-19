1class Solution {
2    public boolean isPalindrome(String s) {
3
4       int left = 0;
5       int right = s.length()-1;
6
7       while(left<right){
8        while(left <right && !Character.isLetterOrDigit(s.charAt(left))){
9            left++;
10        }
11
12        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
13            right--;
14
15        }
16
17        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
18            return false;
19        }
20        left++;
21        right--;
22       }
23       return true;
24    }
25}
26