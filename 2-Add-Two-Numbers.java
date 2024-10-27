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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // Dummy head for the result list
        ListNode current = dummyHead;           // Pointer for the current node
        int carry = 0;                          // Initialize carry to 0
        
        // Iterate while there are nodes in either list or carry is not zero
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;  // Get value from l1 or 0
            int val2 = (l2 != null) ? l2.val : 0;  // Get value from l2 or 0
            
            // Calculate the sum and carry
            int total = val1 + val2 + carry;
            carry = total / 10;                     // Calculate carry for the next iteration
            int newDigit = total % 10;              // New digit to store
            
            // Create a new node with the new digit
            current.next = new ListNode(newDigit);
            current = current.next;                  // Move to the next node
            
            // Move to the next nodes in l1 and l2 if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummyHead.next;  // Return the next of dummy head to skip it
    }
}
