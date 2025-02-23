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
    private int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        maxpath(root);
        return max;
    }
    public int maxpath(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Math.max(0,maxpath(root.left));
        int rh=Math.max(0,maxpath(root.right));
        max=Math.max(max,lh+rh+root.val);
        return Math.max(lh,rh)+root.val;
    }
}