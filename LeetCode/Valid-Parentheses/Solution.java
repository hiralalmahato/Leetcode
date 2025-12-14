1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for (char ch:s.toCharArray()){
6            if(ch=='('||ch=='{'||ch=='['){
7                stack.push(ch);
8            }
9            else{
10                if(stack.isEmpty()){
11                    return false;
12                }
13
14                char top = stack.pop();
15
16                if(ch==')' && top!='('){
17                    return false;
18
19                }
20                if(ch=='}' && top != '{'){
21                    return false;
22                }
23                if(ch==']'&& top != '['){
24                    return false;
25                }
26            }
27        }
28        return stack.isEmpty();
29        
30    }
31}