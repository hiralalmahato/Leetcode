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
12    public ListNode deleteDuplicates(ListNode head) {
13
14        HashSet<Integer> res = new HashSet<>();
15
16        if(head==null){
17            return null; 
18        }
19
20        ListNode temp = head;
21        res.add(temp.val);
22
23        while(temp.next!=null){
24            if(res.contains(temp.next.val)){
25                temp.next = temp.next.next;
26            }else{
27                res.add(temp.next.val);
28                temp = temp.next;
29            }
30        }
31        return head;
32
33        
34
35        
36    }
37}