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
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxi;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,dfs(root.left));
        int right=Math.max(0,dfs(root.right));

        maxi=Math.max(maxi,left+right+root.val);

        return root.val+Math.max(left,right);
    }

}