1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length();
4        int n= text2.length();
5
6        int[][]dp = new int [m+1][n+1];
7
8        for(int i=m-1;i>=0;i--){
9            for(int j=n-1;j>=0;j--){
10                if(text1.charAt(i)==text2.charAt(j)){
11                    dp[i][j] = 1 + dp[i+1][j+1];
12                }else{
13                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
14                }
15            }
16        }
17        return dp[0][0];
18
19        
20        
21    }
22}