1class Solution {
2    public int myAtoi(String s) {
3
4        int i = 0;
5        int n = s.length();
6        while(i<n && s.charAt(i)== ' '){
7            i++;
8        }
9
10        int sign = 1;
11        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
12            sign = (s.charAt(i)=='-')?-1:1;
13            i++;
14        }
15        long num=0;
16        while(i<n && Character.isDigit(s.charAt(i))){
17            int digit = s.charAt(i)-'0';
18            num = num * 10 + digit;
19
20
21            if(sign==1 && num>Integer.MAX_VALUE){
22                return Integer.MAX_VALUE;
23            }
24            if(sign==-1 && -num<Integer.MIN_VALUE){
25                return Integer.MIN_VALUE;
26            }
27            i++;
28        }
29        return (int)(sign*num);
30        
31    }
32}