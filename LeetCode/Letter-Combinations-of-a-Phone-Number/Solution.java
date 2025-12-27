1class Solution {
2    List<String> result = new ArrayList<>();
3
4    String[] map = {
5        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
6    };
7    public List<String> letterCombinations(String digits) {
8        if(digits.length()==0){
9            return result;
10        }
11        backtrack(digits,0,new StringBuilder());
12        return result;
13        
14    }
15
16    public void backtrack(String digits, int index, StringBuilder current){
17        if(index == digits.length()){
18            result.add(current.toString());
19            return;
20
21        }
22
23        String letters = map[digits.charAt(index)-'0'];
24
25        for(char c: letters.toCharArray()){
26            current.append(c);
27            backtrack(digits,index + 1, current);
28            current.deleteCharAt(current.length() -1 );
29
30        }
31    }
32}