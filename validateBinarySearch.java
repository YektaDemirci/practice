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
    public boolean valid(TreeNode root, Integer low, Integer high) {
        if(root == null) return true;
        if( (low != null && root.val<= low) || (high != null && root.val >= high) )
            return false;
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
            
    }
    public boolean isValidBST(TreeNode root) {
        return valid(root,null,null);
    }
}

/*DFS search
 Failed approach
class Solution {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Integer prev = null;
        while(!stack.isEmpty() || root!=null){
            while(root != null) {
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            if (prev != null && root.val <= prev)
                return false;
            prev = root.val;
            root = root.right;
        }
        return true;
    }
}
*/
