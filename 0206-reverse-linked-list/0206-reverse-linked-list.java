/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        return reverseListSub(head, head.next);
    }

    private ListNode reverseListSub(ListNode prev, ListNode curr) {
        ListNode head;
        if (curr.next != null) head = reverseListSub(curr, curr.next);
        else head = curr;

        curr.next = prev;
        prev.next = null;
        return head;
    }
}