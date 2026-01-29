1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode sortList(ListNode head) {
13
14        if(head==null || head.next==null){
15            return head;
16        }
17        
18
19        ArrayList<Integer> list = new ArrayList<Integer>();
20        ListNode temp = head;
21
22        while(temp != null){
23            list.add(temp.val);
24            temp =temp.next;
25        }
26
27        Collections.sort(list);
28
29
30
31
32        temp = head;
33        int i = 0;
34        while(temp != null){
35            temp.val = list.get(i++);
36
37            temp = temp.next;
38        }
39
40
41        return head;
42
43
44        
45    }
46}