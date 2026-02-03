1class Solution {
2    public int mySqrt(int x) {
3        int i = 0;
4        while(Math.pow(i,2)<=x){
5            i++;
6        }
7
8        return i-1;
9        
10    }
11}