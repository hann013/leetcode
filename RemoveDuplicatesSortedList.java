// Remove Duplicates from Sorted (Linked) List 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while (current != null && current.next != null) {
            ListNode nextNode = current.next;
            
            if (nextNode.val == current.val) {
	            // values are the same, so delete duplicate node
                current.next = nextNode.next;
            } else {
                // no duplicates found, so move on
                current = current.next;
            }
        }
        
        return head;
    }
}