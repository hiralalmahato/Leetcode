1class Solution {
2    public boolean validPalindrome(String s) {
3        int left = 0, right = s.length() - 1;
4
5        while (left < right) {
6            if (s.charAt(left) != s.charAt(right)) {
7                return check(s, left + 1, right) ||
8                       check(s, left, right - 1);
9            }
10            left++;
11            right--;
12        }
13
14        return true;
15    }
16
17    private boolean check(String s, int left, int right) {
18        while (left < right) {
19            if (s.charAt(left++) != s.charAt(right--)) {
20                return false;
21            }
22        }
23        return true;
24    }
25}