1class Solution {
2    public String largestOddNumber(String num) {
3
4        for(int i =num.length() -1;i>=0;i--){
5
6            int digit = num.charAt(i) -'0';   //converting char to number 
7
8            if(digit % 2 !=0){
9                return num.substring(0,i+1);
10            }
11        }
12        return "";
13        
14    }
15}