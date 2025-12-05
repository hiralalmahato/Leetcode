1import java.util.Scanner;
2class Solution {
3    public String longestCommonPrefix(String[] strs) {
4        if(strs.length == 0) return "";
5
6        String prefix = strs[0];
7        for(int i  =1;i<strs.length;i++){
8            while(strs[i].indexOf(prefix)!= 0 ){
9                prefix = prefix.substring(0,prefix.length() - 1);
10                if (prefix.isEmpty()) return "";
11            }
12        }
13        return prefix;
14
15        
16    }
17    public static void main(String[] args){
18        Scanner sc = new Scanner(System.in);
19         
20        int n  = sc.nextInt();
21        sc.nextLine();
22
23
24        String[] strs = new String[n];
25        for(int i = 0;i<n;i++){
26            strs[i] = sc.nextLine();
27        }
28
29        Solution obj = new Solution();
30        String result = obj.longestCommonPrefix(strs);
31
32        System.out.println(result);
33        sc.close();
34    }
35}