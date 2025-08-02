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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        collectLeaves(root1,arr1);
        collectLeaves(root2,arr2);
        return arr1.equals(arr2);
    }
    public void collectLeaves(TreeNode node,List<Integer> leaves){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            leaves.add(node.val);
            return;
        }
        collectLeaves(node.left,leaves);
        collectLeaves(node.right,leaves);
    }
}