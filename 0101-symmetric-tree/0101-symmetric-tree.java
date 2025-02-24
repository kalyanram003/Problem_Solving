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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode Lh,TreeNode Rh){
        if(Lh==null && Rh==null){
            return true;
        }
        if(Lh==null || Rh==null){
            return false;
        }
        return (Lh.val==Rh.val) && isMirror(Lh.left,Rh.right) && isMirror(Lh.right,Rh.left);
    }
}