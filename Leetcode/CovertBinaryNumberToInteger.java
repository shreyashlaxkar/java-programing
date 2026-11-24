class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;

        while (head != null) {
            // Shift existing bits left by 1 (multiply by 2) and append the current bit
            result = (result << 1) | head.val;
            head = head.next;
        }

        return result;
    }
}