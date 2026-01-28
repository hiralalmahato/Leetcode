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
12    public ListNode reverseList(ListNode head) {
13
14
15        if(head==null || head.next == null){
16            return head;
17        }
18
19    //    ListNode prev = head;
20    //    ListNode curr = head.next;
21
22    //    while(curr != null){
23    //      ListNode nextNode = curr.next;
24
25    //      curr.next = prev;
26
27
28    //      prev =curr;
29    //      curr = nextNode;
30    //    }
31
32    //    head.next = null;
33
34    //    return prev;
35
36    ListNode newHead = reverseList(head.next);
37
38
39    head.next.next = head;
40    head.next = null;
41
42    return newHead;
43        
44        
45    }
46}