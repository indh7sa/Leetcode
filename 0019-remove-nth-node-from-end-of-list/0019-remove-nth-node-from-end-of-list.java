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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length == 1) {
            return null; 
        }
        if (length == n) {
            return head.next; 
        }
        ListNode current = head;
        for (int i = 1; i < length - n; i++) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}