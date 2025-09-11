class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode rev = obj.reverseList(head);

        // Print reversed: 3 -> 2 -> 1
        while (rev != null) {
            System.out.print(rev.val + " ");
            rev = rev.next;
        }
    }
}
