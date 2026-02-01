1class MyStack {
2    private Node head;
3
4    class Node{
5        int x;
6        Node next;
7        Node(int x,Node next){
8            this.x = x;
9            this.next = next;
10        }
11    }
12    
13    public void push(int x) {
14
15        if(head==null){
16            head = new Node(x,null);
17        }else{
18            head = new Node(x,head);
19        }
20        
21    }
22    
23    public int pop() {
24        if(head==null){
25            throw new RuntimeException("Stack is Empty");
26        }
27        int val = head.x;
28        head =head.next;
29        return val;
30
31      
32        
33    }
34    
35    public int top() {
36        if(head==null){
37            throw new RuntimeException("Stack is Empty");
38        }
39        return head.x;
40
41        
42    }
43    
44    public boolean empty() {
45        
46        return head==null;
47        
48    }
49}
50
51/**
52 * Your MyStack object will be instantiated and called as such:
53 * MyStack obj = new MyStack();
54 * obj.push(x);
55 * int param_2 = obj.pop();
56 * int param_3 = obj.top();
57 * boolean param_4 = obj.empty();
58 */