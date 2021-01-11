/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> list = new HashSet<>();
        while(head!=null) {
            if(list.contains(head))
                return true;
            else
                list.add(head);
            head=head.next;
        }
        return false;
    }
}
/*Interesting approach
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}*/

/*Why do you consider the values, consider the adress of the values dude!
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int ctr=0;
        int ctr2=0;
        while(head!=null) {
            ctr2++;
            if(map.containsKey(head.val)){
                head=head.next;
            }
            map.put(head.val,ctr);
            ctr++;
            head=head.next;
        }
        
    }
}
*/
