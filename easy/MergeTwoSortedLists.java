// Merge Two Sorted Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {      
        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2; 
        }
        
        ListNode head = null;
        
        if (l1.val < l2.val) {
            // merge l2 into l1
            head = l1;
            mergeLists(l2, l1);
        } else {
            // merge l1 into l2
            head = l2;
            mergeLists(l1, l2);
        }
        
        return head;
    }
    
    void mergeLists(ListNode lFrom, ListNode lInto) {
        while (lFrom != null && lInto != null) {
            // advance lInto until spot to insert lFrom
            while (lInto.next != null && lInto.next.val < lFrom.val) {
                lInto = lInto.next;
            }
            
            if (lInto.next == null) {
                // reached the end of lInto, so append the rest of lFrom  
                lInto.next = lFrom;
                break;
            } else {
                // find end of lFrom segment to insert
                ListNode endLFrom = lFrom;
                while (endLFrom.next != null && endLFrom.next.val < lInto.next.val) {
                    endLFrom = endLFrom.next;
                }

                // insert lFrom into lInto
                ListNode temp = lInto.next;
                lInto.next = lFrom;
                lFrom = endLFrom.next;
                endLFrom.next = lInto = temp;   
            }
        }
    }
}