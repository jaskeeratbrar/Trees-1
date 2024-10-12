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

    TreeNode prev;
    boolean flag;
    public boolean isValidBST(TreeNode root) {
        this.flag = true;
         helper(root);
         return flag;
    }

    private void helper(TreeNode root){
        if (root == null) return;
        helper(root.left);
        if(prev != null && root.val <= prev.val){
            flag = false;
        }
        prev = root;
        if(flag){
            helper(root.right);
        }
        
    }
}


// T(C) : O(n) ie. number of nodes
// T(S) : O(h) height of recursive stack
