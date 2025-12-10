1class Solution {
2    public int beautySum(String s) {
3        int n=s.length();
4        int totalbeauty = 0;
5
6        for(int i = 0;i<n;i++){
7            int [] freq = new int[26];
8            for(int j = i;j<n;j++){
9                freq[s.charAt(j)-'a']++;
10
11                int maxfreq = 0;
12                int minfreq = Integer.MAX_VALUE;
13
14
15                for(int f:freq){
16                    if(f>0){
17                        maxfreq = Math.max(maxfreq,f);
18                        minfreq = Math.min(minfreq,f);
19
20                    }
21                }
22                totalbeauty +=(maxfreq-minfreq);
23            }
24        }
25        return totalbeauty;
26    }
27}