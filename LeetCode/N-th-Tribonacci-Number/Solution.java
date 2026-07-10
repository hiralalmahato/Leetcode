1class Solution {
2    public int tribonacci(int n) {
3
4      if(n==0){
5        return 0;
6      }
7      if(n==1 || n==2){
8        return 1;
9      }
10
11      int[]arr = new int[n+1];
12
13      arr[0] = 0;
14      arr[1] = 1;
15      arr[2] = 1;
16
17      for(int i=3;i<=n;i++){
18        arr[i] = arr[i-1]+ arr[i - 2]+ arr[i-3];
19      }
20
21      return arr[n];
22
23    
24        
25    }
26}