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
13    public ListNode detectCycle(ListNode head) {
14
15        if(head==null || head.next ==null){
16            return null;
17        }
18
19
20        ListNode slow = head;
21        ListNode fast = head;
22
23        while(fast != null && fast.next != null){
24
25            slow = slow.next;
26            fast = fast.next.next;
27           
28            
29
30            if(slow==fast){
31                slow = head;
32                
33                while(slow != fast){
34                    slow = slow.next;
35                    fast = fast.next;
36                    
37                }
38                return slow;
39            }
40
41        }
42
43        return null;
44
45
46        
47    }
48}