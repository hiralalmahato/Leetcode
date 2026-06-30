1class Solution {
2    public int climbStairs(int n) {
3        if(n==1) return 1;
4        
5        if(n==2) return 2;
6
7        int [] num = new int[n];
8
9        num[0] =1;
10        num[1] =2;
11
12        for(int i=2;i<n;i++){
13            num[i] = num[i-2] + num[i-1];
14        }
15        return num[n-1];
16    }
17}