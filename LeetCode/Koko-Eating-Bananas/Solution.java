1
2
3class Solution{
4
5public long hoursTaken(int[] piles,int k){
6    long total = 0;
7    for(int pile:piles){
8        total += (pile + k - 1)/k;
9
10    }
11    return total;
12
13    
14}
15 public int minEatingSpeed(int[] piles, int h) {
16    int low = 1;
17    int high = 0;
18    for (int pile : piles) {
19        high = Math.max(high, pile);
20    }
21
22    int ans = high;
23
24    while(low<=high){
25       int mid = low + (high - low) /2;
26
27       long hours  =  hoursTaken(piles,mid);
28
29       if(hours <= h){
30          ans = mid;
31          high = mid -1;
32
33       }else{
34        low = mid + 1;
35       }
36    }
37    return ans;
38
39
40 }
41}
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62