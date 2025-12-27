1/**
2 * Definition for singly-linked list.
3 * struct ListNode {
4 *     int val;
5 *     ListNode *next;
6 *     ListNode() : val(0), next(nullptr) {}
7 *     ListNode(int x) : val(x), next(nullptr) {}
8 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
9 * };
10 */
11class Solution {
12public:
13    ListNode* reverseList(ListNode* head) {
14        if(head==NULL || head->next==NULL){
15            return head;
16        }
17        ListNode* prev=NULL;
18        ListNode* curr=head;
19        while(curr!=NULL){
20            ListNode* temp=curr;
21            curr=curr->next;
22            temp->next=prev;
23            prev=temp;
24        }
25        return prev;
26    }
27};