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
/*My BFS solution*/
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int ctr=1;
        while(!queue.isEmpty()) {
            int size=queue.size();
            for(int i=0; i<size;i++) {
                if(queue.peek().left==null && queue.peek().right==null)
                    return ctr;
                if (queue.peek().left!=null) queue.add(queue.peek().left);
                if(queue.peek().right!=null) queue.add(queue.peek().right);
                root=queue.pop();
            }
            ctr++;
        }
        return ctr;
    }
}
/*Short in line DFS solution, but must be slower than my solution
public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left+right+1 : Math.min(left,right)+1;
    }
}
*/
