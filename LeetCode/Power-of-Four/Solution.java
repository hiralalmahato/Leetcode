1class Solution {
2    public boolean isPowerOfFour(int n) {
3        boolean r =true;
4
5        for(int i =0;i<50;i++){
6            if(n==Math.pow(4,i)){
7                return r;
8            }
9        }
10        return false;
11
12
13        
14    }
15}