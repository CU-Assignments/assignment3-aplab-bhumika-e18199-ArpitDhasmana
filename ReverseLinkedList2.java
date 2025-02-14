class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode end = start;
        for (int i = left; i < right; i++) {
            end = end.next;
        }
        ListNode nextNode = end.next;
        end.next = null;
        prev.next = reverseList(start);
        start.next = nextNode;

        return dummy.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
