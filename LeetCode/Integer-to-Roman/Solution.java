1class Solution {
2    public String intToRoman(int num) {
3        int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
4        String []symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
5
6        StringBuilder sb  =new StringBuilder();
7
8
9        for(int i =0;i<values.length && num>0;i++){
10            while(num>=values[i]){
11                num -= values[i];
12                sb.append(symbols[i]);
13            }
14        }
15        return sb.toString();
16        
17    }
18}