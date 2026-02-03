1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        int [] ans = new int[n];
5
6
7        Stack<Integer> stack = new Stack<>();
8
9        for(int i = 0;i<n;i++){
10            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
11                int prevDay = stack.pop();
12                ans[prevDay] = i - prevDay;
13            }
14            stack.push(i);
15        }
16        return ans;
17        
18    }
19}