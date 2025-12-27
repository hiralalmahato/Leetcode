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
17        stack<int>st;
18        ListNode* temp=head;
19        while(temp!=NULL){
20            st.push(temp->val);
21            temp=temp->next;
22        }
23        temp=head;
24        while(temp!=NULL){
25            temp->val=st.top();
26            st.pop();
27            temp=temp->next;
28        }
29        return head;
30    }
31};