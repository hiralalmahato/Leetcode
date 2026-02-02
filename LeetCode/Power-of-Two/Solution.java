1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        boolean r = true;
4
5        for(int i =0;i<31;i++){
6           if(n ==Math.pow(2,i) ){
7            return r;
8           }
9        }
10
11        return false;
12        
13        
14
15        
16    }
17}