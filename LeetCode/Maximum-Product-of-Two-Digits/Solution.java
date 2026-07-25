1class Solution {
2    public int maxProduct(int n) {
3
4        String s = String.valueOf(n);
5
6        int []arr = new int[s.length()];
7
8        for(int i=0;i<s.length();i++){
9            arr[i] = s.charAt(i) - '0';
10        }
11
12        int maxProduct = 0;
13
14        for(int i = 0;i<arr.length;i++){
15            for(int j = i+1;j<arr.length;j++){
16                maxProduct = Math.max(maxProduct,arr[i]*arr[j]);
17            }
18        }
19        return  maxProduct;
20
21        
22    }
23}