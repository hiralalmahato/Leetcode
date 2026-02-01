1class Solution {
2    public String decodeString(String s) {
3
4        Stack<Integer> countStack = new Stack<>();
5        Stack<StringBuilder> stringStack = new Stack<>();
6
7        StringBuilder currentString = new StringBuilder();
8        int k = 0;
9
10        for (char ch : s.toCharArray()) {
11
12            // If digit → build number
13            if (Character.isDigit(ch)) {
14                k = k * 10 + (ch - '0');
15            }
16
17            // If '[' → save state
18            else if (ch == '[') {
19                countStack.push(k);
20                stringStack.push(currentString);
21                currentString = new StringBuilder();
22                k = 0;
23            }
24
25            // If ']' → decode
26            else if (ch == ']') {
27                int repeat = countStack.pop();
28                StringBuilder prevString = stringStack.pop();
29
30                for (int i = 0; i < repeat; i++) {
31                    prevString.append(currentString);
32                }
33
34                currentString = prevString;
35            }
36
37            // Normal character
38            else {
39                currentString.append(ch);
40            }
41        }
42
43        return currentString.toString();
44    }
45} 