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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans =new ArrayList<String>();
        if(root!=null) goPath(root,"",ans);
        return ans; 
    }
    public void goPath(TreeNode node,String path,List<String> ans){
        if(node.left==null && node.right==null) ans.add(path+node.val);
        if(node.left!=null) goPath(node.left,path+node.val+"->",ans);
        if(node.right!=null) goPath(node.right,path+node.val+"->",ans);
    }
}