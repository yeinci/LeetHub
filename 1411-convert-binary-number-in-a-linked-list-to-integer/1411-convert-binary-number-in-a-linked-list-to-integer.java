class Solution {
    public int getDecimalValue(ListNode head) {
        return Integer.parseInt(getDecimalValueString(head), 2);
    }
    private String getDecimalValueString (ListNode head) {
        if (head == null) return "";
        return Integer.toString(head.val) + getDecimalValueString(head.next);
    }
}