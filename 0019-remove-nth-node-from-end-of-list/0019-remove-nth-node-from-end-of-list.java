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
        // Step 1: Find length of the list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Handle special cases
        if (length == 1) {
            return null; 
        }
        if (length == n) {
            return head.next; 
        }

        // Step 3: Traverse again to find (length - n)-th node
        ListNode current = head;
        for (int i = 1; i < length - n; i++) {
            current = current.next;
        }

        // Step 4: Remove the node
        current.next = current.next.next;

        return head;
    }
}