/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*Found, more neat solution*/
class Solution {
public int maxDepth(TreeNode root) {
    if(root == null) return 0;
    return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
/* Implemented Solution
class Solution {
    public int maxDepth(TreeNode root) {
        int ctr=0;
        if(root == null)
            return ctr;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size;i++) {
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                queue.pop();
            }
            ctr++;
        }
        return ctr;
    }
}
*/
