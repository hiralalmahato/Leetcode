1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0 || (x%10==0  && x!=0)){
4            return false;
5        }
6
7
8        int original = x;
9        int reverse = 0;
10
11        while(x>0){
12            int digit = x % 10;
13            reverse = reverse * 10 +digit;
14            x = x/10;
15        }
16        return original==reverse;
17        
18    }
19}