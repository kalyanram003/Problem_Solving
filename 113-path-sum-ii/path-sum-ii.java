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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,new ArrayList<>(),targetSum,ans);
        return ans;
    }
    public void dfs(TreeNode root,List<Integer> path,int targetSum,List<List<Integer>> ans){
        if(root==null) return;

        path.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum){
            ans.add(new ArrayList<>(path));
        }
        else{
            dfs(root.left,path,targetSum-root.val,ans);
            dfs(root.right,path,targetSum-root.val,ans);
        }
        path.remove(path.size()-1);
    }
}