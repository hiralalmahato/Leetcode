1class Solution {
2
3    public int solve(int  amount, int[]coins,int index,int[][]dp){
4        if(amount==0){
5            return 1;
6        }
7
8        if(amount<0){
9            return 0;
10        }
11        if(index>=coins.length){
12            return 0;
13        }
14        
15        if(dp[index][amount] != -1){
16            return dp[index][amount];
17        }
18
19        
20        
21
22        int include = solve(amount-coins[index],coins,index,dp);
23
24        int exclude = solve(amount,coins,index+1,dp);
25
26        int finalAns = include + exclude;
27        dp[index][amount] =  finalAns;
28        return dp[index][amount];
29
30
31    }
32    public int change(int amount, int[] coins) {
33
34        int index  =0;
35        int dp[][]  = new int[coins.length][amount+1];
36
37        for(int[] num:dp){
38            Arrays.fill(num,-1);
39
40        }
41        int ans = solve(amount,coins,0,dp);
42        return ans;
43        
44    }
45}