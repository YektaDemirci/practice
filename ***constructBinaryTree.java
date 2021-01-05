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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0)
            return null;
        
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i< inorder.length; i++) {
            map.put(inorder[i],i);
        }
        
        /*Using ctr will not work; pass by reference*/
        int ctr=0;
        int[] current = {0};
        TreeNode root = builtTree(preorder,current,0,preorder.length-1,map,ctr);
        return root;
    }
    public TreeNode builtTree(int[] pre, int[] current, int low, int high, Map<Integer,Integer> map, int ctr) {
        if(current[0]>=pre.length) return null;
        TreeNode root = new TreeNode(pre[current[0]]);
        if(low>high) return null;
        else {
            //ctr += 1;
            current[0] += 1;
            /*System.out.println("curr is" + current[j]);
            System.out.println("ctr is" + ctr);*/
            int i = map.get(root.val);
            root.left = builtTree(pre, current, low, i-1, map, ctr);
            root.right = builtTree(pre, current, i+1, high, map, ctr);
        }
        return root;
    }
}
