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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;
        for (int i = 0; i < k; i++) {
            ListNode curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }

            ListNode last = curr.next;
            curr.next = null;
            last.next = head;
            head = last;
        }
        return head;
    }
}
