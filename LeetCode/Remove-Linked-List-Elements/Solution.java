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
12    public ListNode removeElements(ListNode head, int val) {
13        
14        ListNode dummy = new ListNode(0);
15
16        dummy.next  = head;
17
18        ListNode prev = dummy;
19        ListNode curr = head;
20
21        while(curr != null){
22            if(curr.val == val){
23                prev.next = curr.next;
24            }else{
25                prev = curr;
26            }
27
28            curr = curr.next;
29        }
30
31        return dummy.next;
32        
33
34        
35        
36    }
37}