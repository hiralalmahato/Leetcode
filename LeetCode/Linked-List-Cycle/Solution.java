1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14
15        if(head==null || head.next==null){
16            return false;
17        }
18
19        
20
21        ListNode prev= head;
22        ListNode curr = head;
23
24
25        while(prev != null && prev.next!= null){
26            curr = curr.next;
27            prev = prev.next.next;
28
29
30            if(curr == prev){
31                return true;
32            }
33        }
34        return false;
35
36
37
38
39        
40    }
41}