/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();

        ListNode tmp = headA;
        while (tmp != null) {
            s1.push(tmp);
            tmp = tmp.next;
        }
        tmp = headB;
        while (tmp != null) {
            s2.push(tmp);
            tmp = tmp.next;
        }
        ListNode res = null;
        while (!s1.empty() && !s2.empty()) {
            ListNode nodeA = s1.pop();
            ListNode nodeB = s2.pop();
            if (nodeA == nodeB) res = nodeA;
            else break;
        }
        return res;
    }
}