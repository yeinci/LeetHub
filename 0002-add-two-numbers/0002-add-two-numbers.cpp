/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        return addTwoNumbersSub(l1, l2, 0);
    }
private:
    ListNode* addTwoNumbersSub(ListNode* l1, ListNode* l2, int carry) {
        if (l1 == nullptr && l2 == nullptr && carry == 0) return nullptr;

        int l1val = (l1 != nullptr) ? l1->val : 0;
        int l2val = (l2 != nullptr) ? l2->val : 0;

        int sum = l1val + l2val + carry;
        int val = sum % 10;
        int newCarry = sum / 10;

        return new ListNode(val, addTwoNumbersSub(l1 != nullptr ? l1->next : nullptr, l2 != nullptr ? l2->next : nullptr, newCarry));
    }
};