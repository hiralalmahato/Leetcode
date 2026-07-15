1class Solution {
2
3    public int gcd(int a,int b){
4        if(b==0){
5            return a ;
6        }
7
8        return gcd(b,a % b);
9    }
10    public int gcdOfOddEvenSums(int n) {
11        int sumOdd = n * n;
12
13        int sumEven = n * (n +1);
14
15        return gcd(sumEven,sumOdd);
16        
17    }
18}