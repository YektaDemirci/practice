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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        queue.add(root);
        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> cur = new ArrayList<>();
            for(int i=0; i<level; i++) {
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                cur.add(queue.poll().val);
            }
            ans.add(cur);
        }
        return ans;
    }
}

/*Failed BFS Solution, it does not consider depth properly, introducing Pairs makes it complex
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<Pair> queue = new ArrayDeque<>();
        if(root != null) {
            queue.add(Pair(TreeNode root, int 0));
            list.add(new ArrayList<> (Arrays.asList(root.val)));
        }
        while( !queue.isEmpty() ) {
            List<Integer> cur = new ArrayList<>();
            root = queue.poll();
            if(root != null) {
                if (root.left != null) {
                    queue.add(root.left);
                    cur.add(root.left.val);
                }
                if (root.right != null) {
                    queue.add(root.right);
                    cur.add(root.right.val);
               }
                if(!cur.isEmpty())
                    list.add(new ArrayList<>(cur));
            }
        }
        return list;
    }
}
*/
