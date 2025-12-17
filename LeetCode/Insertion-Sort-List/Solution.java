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
12    public ListNode insertionSortList(ListNode head) {
13
14         ListNode dummy  =new ListNode(0);
15
16         ListNode curr = head;
17
18         while(curr!=null){
19            ListNode prev = dummy;
20            
21            while(prev.next != null && prev.next.val<= curr.val){
22                prev = prev.next;
23            }
24
25            ListNode next=curr.next ;
26            curr.next = prev.next;
27            prev.next = curr;
28
29            curr  = next;
30         }
31         return dummy.next;
32        
33    }
34}