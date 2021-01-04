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
            if ((head.next != null) && (head.val == head.next.val)) {
                while((head.next != null) && (head.val == head.next.val)) {
                    head=head.next;
                }
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
/* Failed approach
        ListNode ans = new ListNode();
        ListNode temp = new ListNode();
        ListNode temp2 = new ListNode();
        ans=head;
        temp=head;
        temp2=head;
        temp = head.next;
        temp2 = head.next;
        while(temp2.next != null) {
            if(temp.val == temp2.next.val) {
                temp2 = (temp2.next != null) ? temp2.next : null;
            }
            else{
                if(temp != temp2)
                {
                    pre.next=temp2;
                    pre=temp2;
                    temp=temp2;
                }
                else {
                    pre.next=temp2;
                    pre=temp2;
                    temp=temp.next;
                    temp2=temp.next;
                }
            }
        }
        return ans;
    }
}
*/
