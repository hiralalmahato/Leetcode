1class Solution {
2    public long getDescentPeriods(int[] prices) {
3
4        long ans = 1;
5        long len = 1;
6         
7  
8
9        for(int i = 1;i<prices.length;i++){
10            if(prices[i]==prices[i-1]-1){
11                len++;
12            }else{
13                len=1;
14            }
15            ans += len;
16        }
17        return ans;
18
19        
20    }
21}