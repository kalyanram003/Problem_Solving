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
    private int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        backTrack(root,new StringBuilder());
        return sum;
    }
    public void backTrack(TreeNode root,StringBuilder sb){
        sb.append(root.val);
        if(root.left==null && root.right==null){
            String temp=sb.toString();
            sum+=Integer.parseInt(temp);
        }else{
            if(root.left!=null) backTrack(root.left,sb);
            if(root.right!=null) backTrack(root.right,sb);
        }
        sb.deleteCharAt(sb.length()-1);
    }
}