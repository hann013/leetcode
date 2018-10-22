// Odd Even Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
    	// zero or one element list
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = odd.next;
        ListNode evenHead = even;
        
        while (odd.next != null && even.next != null) {
            // link odd to next odd
            odd.next = even.next;
            odd = odd.next;
            
            // link even to next even
            even.next = odd.next;
            even = even.next;
        }
        
        // append the head of all evens to odd
        odd.next = evenHead;
        return head;
    }
}