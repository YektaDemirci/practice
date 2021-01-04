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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int flag = 1;
        while(!queue.isEmpty()) {
            List<Integer> cur = new ArrayList();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                cur.add(queue.pop().val);
            }
            if (flag == 0) {
                Collections.reverse(cur);
            }
            list.add(cur);
            flag = (flag+1)%2;
        }
        return list;
        
        
    }
}
