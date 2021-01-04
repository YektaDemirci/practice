/* Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
Memory Usage: 38.4 MB, less than 65.65% of Java online submissions for Remove Duplicates from Sorted List.*/
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(0,head);
        ListNode pre = ans;
        while(head != null) {
            if ( (head.next != null) && (head.val == head.next.val)) {
                pre=pre.next;
                while( (head.next != null) && (head.val == head.next.val) )
                    head=head.next;
                pre.next=head.next;
            }
            else {
                pre=pre.next;
            }
            head=head.next;
        }
        return ans.next;
    }
}
