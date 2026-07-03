1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        Set<String> store = new HashSet<>(wordDict);
4        boolean[]dp = new boolean[s.length()+1];
5
6        dp[0] = true;
7
8        for(int i=1;i<=s.length();i++){
9            for(int j=0;j<i;j++){
10                if(dp[j] && store.contains(s.substring(j,i))){
11                    dp[i] = true;
12                    break;
13                }
14            }
15        }
16        return dp[s.length()];
17        
18    }
19
20    
21}