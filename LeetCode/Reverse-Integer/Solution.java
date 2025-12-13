1class Solution {
2    public int reverse(int x) {
3        int rev  = 0;
4         while(x>0 || x<0){
5            int digit = x%10;
6             
7            
8            
9
10            if(rev>Integer.MAX_VALUE/10 ||(rev == Integer.MAX_VALUE/10 && digit > 7)){
11                return 0;
12            }
13            if(rev<Integer.MIN_VALUE/10 ||(rev==Integer.MIN_VALUE/10 && digit < -8)){
14                return 0;
15            }
16            rev = rev * 10 +digit;
17            x  =x/10;
18            
19
20
21         }
22         return rev;
23        
24    }
25}