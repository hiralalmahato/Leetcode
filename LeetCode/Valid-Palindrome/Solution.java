1class Solution {
2    public boolean isPalindrome(String s) {
3
4        int left = 0;
5        int right = s.length() - 1;
6
7        while (left < right) {
8
9            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
10                left++;
11            }
12
13            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
14                right--;
15            }
16
17            if (Character.toLowerCase(s.charAt(left)) !=
18                Character.toLowerCase(s.charAt(right))) {
19                return false;
20            }
21
22            left++;
23            right--;
24        }
25
26        return true;
27    }
28}
29