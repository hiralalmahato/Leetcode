1class Solution {
2    public int numberOfWays(String corridor) {
3        long MOD = 1000000007;
4        int totalSeats = 0;
5
6        for(char ch: corridor.toCharArray()){
7            if(ch=='S'){
8                totalSeats++;
9            }
10        }
11
12        if(totalSeats<2 || totalSeats % 2 != 0){
13            return 0;
14
15        }
16
17        long ways =1;
18        int seatCount = 0;
19        int plantCount = 0;
20
21        for(char ch:corridor.toCharArray()){
22            if(ch=='S'){
23                seatCount++;
24
25                if(seatCount >2 && seatCount % 2 ==1){
26                    ways = (ways * (plantCount+1)) % MOD;
27
28                    plantCount = 0;
29                }
30            }
31            else if(ch=='P'){
32                if(seatCount>=2 && seatCount % 2 ==0){
33                    plantCount++;
34                }
35
36            }
37        }
38        return (int) ways;
39        
40    }
41}