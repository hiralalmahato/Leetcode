1class Solution {
2    public int romanToInt(String s) {
3
4        int total = 0;
5        int prev = 0;
6
7        for(int i=s.length()-1;i>=0;i--){
8            int curr = switch(s.charAt(i)){
9                case 'I'->1;
10                case 'V'->5;
11                case 'X'->10;
12                case 'L'->50;
13                case 'C'->100;
14                case 'D'->500;
15                default ->1000;
16                
17            };
18
19            if(curr<prev){
20                total -=curr;
21            }else{
22                total += curr;
23            }
24
25            prev = curr;
26        }
27        return total;
28        
29    }
30}