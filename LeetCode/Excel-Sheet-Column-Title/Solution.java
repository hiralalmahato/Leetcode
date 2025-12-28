1class Solution {
2    public String convertToTitle(int columnNumber) {
3
4        StringBuilder sb = new StringBuilder();
5
6        while(columnNumber>0){
7            columnNumber--;
8
9            int rem = columnNumber % 26;
10            sb.append((char)('A'+rem));
11            columnNumber = columnNumber /26;
12        }
13        return sb.reverse().toString();
14        
15    }
16}